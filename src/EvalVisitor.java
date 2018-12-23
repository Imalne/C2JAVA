import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;
import com.sun.xml.internal.ws.config.management.policy.ManagementPolicyValidator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import sun.security.krb5.internal.PAData;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EvalVisitor extends LabeledExprBaseVisitor<Node> {

    Map<String,String> key_type = new HashMap<String, String>();
    Map<String,String> func_type = new HashMap<String,String>();
    @Override
    public Node visitProg(LabeledExprParser.ProgContext ctx) {
        String main_code = visitMainDecl(ctx.mainDecl()).visitString;
        String normalFunc = "";
        for (LabeledExprParser.NormalFuncContext ele : ctx.normalFunc()) {
            normalFunc += visitNormalFunc(ele);
        }
        Node node = new Node();
        node.visitString = "public class Main {public static void main(String[] args) {_main(args.length,args);}" + main_code + normalFunc + '}';
        return node;
    }


    @Override
    public Node visitMainDecl(LabeledExprParser.MainDeclContext ctx) {
        String type = visit(ctx.type()).visitString;
        String func_name = "_main";
        String parameters = "";
        if (ctx.parameters() != null)
            parameters = visit(ctx.parameters()).visitString;
        String block = visit(ctx.block()).visitString;
        Node node = new Node();
        node.visitString = "public static " + type + ' ' + func_name + "(int argc,String[] args)" + block;;
        return node;
    }

    @Override
    public Node visitNormalFunc(LabeledExprParser.NormalFuncContext ctx) {
        String type = visit(ctx.type()).visitString;
        String func_name = ctx.ID().getText();
        String parameters = visit(ctx.parameters()).visitString;
        this.func_type.put(func_name,type);
        String block = visit(ctx.block()).visitString;
        Node node = new Node();
        node.visitString = "public static " + type + ' ' + func_name + '(' + parameters + ')' + block;
        return node;
    }

    @Override
    public Node visitSingleVariable(LabeledExprParser.SingleVariableContext ctx) {
        String type = visit(ctx.type()).visitString;
        String id = ctx.ID().getText();
        this.key_type.put(id,type);
        String extern = "";
        if (ctx.getChildCount() == 4) {
            extern += ctx.getChild(2).getText();
            extern += visit(ctx.expr()).visitString;
        }
        Node node = new Node();
        node.visitString = type + " " + id + " " + extern;
        return node;
    }

    @Override
    public Node visitArrayVariable(LabeledExprParser.ArrayVariableContext ctx) {
        String type = visit(ctx.type()).visitString;
        String id = ctx.ID().getText();
        String len = ctx.INT().getText();
        this.key_type.put(id,type+"[]");
        Node node = new Node();
        node.visitString = type + "[] " + id + "= new " + type + '[' + len + ']';
        return node;
    }

    @Override
    public Node visitArrayInitVariable(LabeledExprParser.ArrayInitVariableContext ctx) {
        String type = visit(ctx.type()).visitString;
        String id = ctx.ID().getText();
        this.key_type.put(id,type+"[]");
        String initValues = ctx.arrayInitValues().getText();
        String len;
        Node declare = new Node();
        if (ctx.INT() == null) {
            if (ctx.arrayInitValues().expr() != null) {
                declare.visitString = type + "[] " + id + "=" + visit(ctx.arrayInitValues().expr()).visitString;
                return declare;
            }
            declare.visitString =  type + "[] " + id + "=" + initValues;
            return declare;
        } else
            len = ctx.INT().getText();
        declare.visitString = type + "[] " + id + "= new " + type + '[' + len + "]";
        if (ctx.arrayInitValues().stringArrayInit() != null) {
            List<TerminalNode> list = ctx.arrayInitValues().stringArrayInit().CHAR();
            int length = list.size();
            for (int i = 0; i < length; i++) {
                declare.visitString += ";";
                declare.visitString += id + '[' + String.valueOf(i) + "]=" + list.get(i).getText();
            }
        } else if (ctx.arrayInitValues().intArrayInit() != null) {
            List<TerminalNode> list = ctx.arrayInitValues().intArrayInit().INT();
            int length = list.size();
            if (length == 1 && list.get(0).getText().equals("0")) {
                declare.visitString += ";for(int i = 0;i<" + len + ";i++)" + id + "[i]=0";
                return declare;
            }
            for (int i = 0; i < length; i++) {
                declare.visitString += ";";
                declare.visitString += id + '[' + String.valueOf(i) + "]=" + list.get(i).getText();
            }
        } else if (ctx.arrayInitValues().stringArrayInit() != null) {
            List<TerminalNode> list = ctx.arrayInitValues().boolArrayInit().BOOL();
            int length = list.size();
            for (int i = 0; i < length; i++) {
                declare.visitString += ";";
                declare.visitString += id + '[' + String.valueOf(i) + "]=" + list.get(i).getText();
            }
        } else if (ctx.arrayInitValues().expr() != null) {
            declare.visitString = type + "[] " + id + "=" + visit(ctx.arrayInitValues().expr()).visitString;
        }
        return declare;
    }

    @Override
    public Node visitParameters(LabeledExprParser.ParametersContext ctx) {
        String parameters_code = "";
        String parameter_code = "";
        for (LabeledExprParser.ParameterContext ele : ctx.parameter()) {
            parameter_code = visit(ele).visitString;
            parameters_code += ',' + parameter_code;
        }
        Node node = new Node();
        node.visitString = parameters_code.substring(1);
        return node;
    }

    @Override
    public Node visitParameter(LabeledExprParser.ParameterContext ctx) {
        String type = "";
        String id = "";
        id = ctx.ID().getText();
        type = visit(ctx.type()).visitString;
        Node node = new Node();
        node.visitString = type + ' ' + id;
        return node;
    }

    @Override
    public Node visitBlock(LabeledExprParser.BlockContext ctx) {
        String block = "";
        for (LabeledExprParser.StatContext ele : ctx.stat()) {
            block += visit(ele).visitString;
        }
        Node node = new Node();
        node.visitString =  '{' + block + '}';
        return node;
    }


    @Override
    public Node visitNewBlock(LabeledExprParser.NewBlockContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Node visitVariableDeclare(LabeledExprParser.VariableDeclareContext ctx) {
        Node node = new Node();
        node.visitString = visit(ctx.valDecl()).visitString + ';';
        node.type = visit(ctx.valDecl()).type;
        return node;
    }

    @Override
    public Node visitIf(LabeledExprParser.IfContext ctx) {
        Node condition = visit(ctx.expr());
        Node if_deal = visit(ctx.stat(0));
        String elseif = "";
        String else_deal = "";
        for (LabeledExprParser.ElseifContext ele : ctx.elseif()) {
            elseif += visit(ele).visitString;
        }
        if (ctx.stat().size() > 1) {
            else_deal = "else" + visit(ctx.stat(1)).visitString;
        }
        Node node = new Node();
        node.visitString = "if(" + condition.visitString + ")" + if_deal.visitString + elseif + else_deal;
        node.type = "";
        return node;
    }

    @Override
    public Node visitElseif(LabeledExprParser.ElseifContext ctx) {
        Node node = new Node();
        Node condition = visit(ctx.expr());
        Node elseif_deal = visit(ctx.stat());
        node.visitString = "else if(" + condition.visitString + ")" + elseif_deal.visitString;
        node.type = "";
        return node;
    }

    @Override
    public Node visitFor(LabeledExprParser.ForContext ctx) {
        return visitForLoop(ctx.forLoop());
    }

    @Override
    public Node visitWhile(LabeledExprParser.WhileContext ctx) {
        return visitWhileLoop(ctx.whileLoop());
    }

    @Override
    public Node visitReturn(LabeledExprParser.ReturnContext ctx) {
        String return_content = "";
        if (ctx.expr() != null) {
            return_content = visit(ctx.expr()).visitString;
        }
        Node node = new Node();
        node.visitString = "return " + return_content + ";";
        return node;
    }

    @Override
    public Node visitVariableAssign(LabeledExprParser.VariableAssignContext ctx) {
        Node node = new Node();
        node.visitString = visitAssign(ctx.assign()).visitString + ';';
        node.type = visitAssign(ctx.assign()).type;
        return node;
    }

    @Override
    public Node visitStatExpr(LabeledExprParser.StatExprContext ctx) {
        Node node = new Node();
        node.visitString = visit(ctx.expr()).visitString + ";";
        node.type = visit(ctx.expr()).type;
        return node;
    }

    @Override
    public Node visitAssign(LabeledExprParser.AssignContext ctx) {
        Node expr_1 = visit(ctx.expr(0));
        Node expr_2 = visit(ctx.expr(1));
        Node node = new Node();
        node.visitString = expr_1.visitString + '=' + expr_2.visitString;
        if(!expr_1.type.equals(expr_2.type))
            System.out.printf("$s cann't be assign to %s\n",expr_2.type,expr_1.type);
        return  node;
    }

    @Override
    public Node visitForLoop(LabeledExprParser.ForLoopContext ctx) {
        String condition_1 = "";
        String condition_2 = "";
        String condition_3 = "";
        if (ctx.valDecl() != null) {
            condition_1 = visit(ctx.valDecl()).visitString;
            condition_2 = visit(ctx.expr(0)).visitString;
            condition_3 = visit(ctx.expr(1)).visitString;
        } else {
            condition_1 = visit(ctx.assign()).visitString;
            condition_2 = visit(ctx.expr(0)).visitString;
            condition_3 = visit(ctx.expr(1)).visitString;
        }
        String content = visit(ctx.stat()).visitString;
        Node node = new Node();
        node.visitString = "for(" + condition_1 + ';' + condition_2 + ';' + condition_3 + ')' + content;
        node.type = "";
        return node;
    }

    @Override
    public Node visitWhileLoop(LabeledExprParser.WhileLoopContext ctx) {
        String condition = visit(ctx.expr()).visitString;
        String content = visit(ctx.stat()).visitString;
        Node node = new Node();
        node.visitString = "while(" + condition + ")" + content;
        return node;
    }

    @Override
    public Node visitParentheses(LabeledExprParser.ParenthesesContext ctx) {
        Node node = new Node();
        node.visitString = "(" + visit(ctx.expr()).visitString + ")";
        node.type = visit(ctx.expr()).type;
        return node;
    }

    @Override
    public Node visitString(LabeledExprParser.StringContext ctx) {
        Node node = new Node();
        node.visitString = ctx.STRING().getText() + ".toCharArray()";
        node.type = "char[]";
        return node;
    }

    @Override
    public Node visitBool(LabeledExprParser.BoolContext ctx) {
        Node node = new Node();
        node.visitString = ctx.BOOL().getText();
        node.type = "boolean";
        return node;
    }

    @Override
    public Node visitBitwiseAnd(LabeledExprParser.BitwiseAndContext ctx) {
        Node node = new Node();
        node.visitString = visit(ctx.expr(0)).visitString + ctx.op.getText() + visit(ctx.expr(1)).visitString;
        node.type = "boolean";
        return node;
    }

    @Override
    public Node visitMulAndDiv(LabeledExprParser.MulAndDivContext ctx) {
        Node node = new Node();
        Node expr_1 = visit(ctx.expr(0));
        Node expr_2 = visit(ctx.expr(1));
        node.visitString = expr_1.visitString+ctx.op.getText()+expr_2.visitString;
        if(expr_1.type.equals(expr_2.type)){
            System.out.printf("%s cann't %s %s\n",expr_1.type,ctx.op.getText(),expr_2.type);
        }
        node.type = expr_1.type;
        return  node;
//        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public Node visitLogical_cp(LabeledExprParser.Logical_cpContext ctx) {
        Node node = new Node();
        node.visitString = visit(ctx.expr(0)).visitString + ctx.op.getText() + visit(ctx.expr(1)).visitString;
        node.type = "boolean";
        return node;
    }

    @Override
    public Node visitInt(LabeledExprParser.IntContext ctx) {
        Node node = new Node();
        node.visitString = ctx.INT().getText();
        node.type = "int";
        return node;
    }

    @Override
    public Node visitNegative(LabeledExprParser.NegativeContext ctx) {
        Node node = new Node();
        Node expr = visit(ctx.expr());
        node.visitString = "- " + expr.visitString;
        node.type = expr.type;
        return node;
    }

    @Override
    public Node visitByteShift(LabeledExprParser.ByteShiftContext ctx) {
        Node node = new Node();
        Node expr_1 = visit(ctx.expr(0));
        Node expr_2 = visit(ctx.expr(1));
        node.visitString = expr_1.visitString+ctx.op.getText()+expr_2.visitString;
        if(expr_1.type.equals("INT")){
            System.out.printf("%s cann't shift\n",expr_1.type);
        }else if(expr_2.type.equals("INT")){
            System.out.printf("shift step should be int\n");
        }
        node.type = expr_1.type;
        return  node;
    }

    @Override
    public Node visitNegate(LabeledExprParser.NegateContext ctx) {
        Node node = new Node();
        Node expr = visit(ctx.expr());
        node.visitString = "! " + expr.visitString;
        node.type = expr.type;
        return node;
    }

    @Override
    public Node visitIncreaseAndDecreaseAfter(LabeledExprParser.IncreaseAndDecreaseAfterContext ctx) {
        Node node = new Node();
        Node expr = visit(ctx.expr());
        node.visitString = expr.visitString + ctx.op.getText();
        node.type = expr.type;
        return node;
    }

    @Override
    public Node visitConsoleInt(LabeledExprParser.ConsoleIntContext ctx) {

        Node var = visit(ctx.expr());
        String s = "try {";
        String t = " = (char) System.in.read();} catch (Exception e) {e.printStackTrace();}";
        Node node  = new Node();
        node.visitString = s + var.visitString + t;
        return node;
    }


    @Override
    public Node visitIncreaseAndDecreaseBefore(LabeledExprParser.IncreaseAndDecreaseBeforeContext ctx) {
        Node node = new Node();
        Node expr = visit(ctx.expr());
        node.visitString = ctx.op.getText() + expr.visitString;
        node.type = expr.type;
        return node;
    }

    @Override
    public Node visitFuncCall(LabeledExprParser.FuncCallContext ctx) {
        Node node = new Node();

        String func_name = ctx.ID().getText();
        node.type = func_type.get(func_type.get(func_name));

        Node parameters = null;
        if (ctx.exprList() != null)
            parameters = visit(ctx.exprList());
        node.visitString = func_name + "(" + parameters.visitString + ")";
        return node;
    }

    @Override
    public Node visitId(LabeledExprParser.IdContext ctx) {
        Node node = new Node();
        node.visitString = ctx.ID().getText();
        if(key_type.containsKey(node.visitString)){
            node.type = key_type.get(node.visitString);
        }
        else if(func_type.containsKey(node.visitString)){
            node.type = func_type.get(node.visitString);
        }
        node.type = "";
        return node;
    }

    @Override
    public Node visitConsoleOut(LabeledExprParser.ConsoleOutContext ctx) {
        String printf = "System.out.printf(";
        String format = ctx.STRING().getText();
        String parameters = "";
        if (ctx.exprList() != null) {
            parameters += ',';
            parameters += visit(ctx.exprList()).visitString;
        }
        Node node = new Node();
        node.visitString = printf + format + parameters + ")";
        return node;
    }

    @Override
    public Node visitSelfPlusAndSub(LabeledExprParser.SelfPlusAndSubContext ctx) {
        Node node = new Node();
        Node expr_1 = visit(ctx.expr(0));
        Node expr_2 = visit(ctx.expr(1));
        node.visitString = expr_1.visitString+ctx.op.getText()+expr_2.visitString;
        if(expr_1.type.equals(expr_2.type)){
            System.out.printf("%s cann't %s %s\n",expr_1.type,ctx.op.getText(),expr_2.type);
        }
        node.type = expr_1.type;
        return  node;
    }

    @Override
    public Node visitArrayAccess(LabeledExprParser.ArrayAccessContext ctx) {
        Node node = new Node();
        Node arrayName = visit(ctx.expr(0));
        Node accessIndex = visit(ctx.expr(1));
        node.visitString = arrayName.visitString + '[' + accessIndex.visitString + ']';
        node.type = arrayName.type;
        return node;
    }

    @Override
    public Node visitPlusAndSub(LabeledExprParser.PlusAndSubContext ctx) {
        Node node = new Node();
        Node expr_1 = visit(ctx.expr(0));
        Node expr_2 = visit(ctx.expr(1));
        node.visitString = expr_1.visitString+ctx.op.getText()+expr_2.visitString;
        if(expr_1.type.equals(expr_2.type)){
            System.out.printf("%s cann't %s %s\n",expr_1.type,ctx.op.getText(),expr_2.type);
        }
        node.type = expr_1.type;
        return  node;
    }

    @Override
    public Node visitExprList(LabeledExprParser.ExprListContext ctx) {
        String expr_list = "";
        for (LabeledExprParser.ExprContext ele : ctx.expr()) {
            expr_list += ',' + visit(ele).visitString;
        }
        Node node = new Node();
        node.visitString = expr_list.substring(1);
        return node;
    }

    @Override
    public Node visitType(LabeledExprParser.TypeContext ctx) {
        String type = ctx.VTYPE().getText();
        if (type.equals("bool"))
            type = "boolean";
        if (ctx.getChildCount() != 1) {
            type += "[]";
        }
        Node node = new Node();
        node.visitString = type;
        node.type = "type";
        return node;
    }

    @Override
    public Node visitChar(LabeledExprParser.CharContext ctx) {
        Node node = new Node();
        node.visitString = ctx.CHAR().getText();
        node.type = "char";
        return node;
    }

    @Override
    public Node visitSwitch(LabeledExprParser.SwitchContext ctx) {
        String condition = visit(ctx.expr()).visitString;
        String caselist = "";
        for (LabeledExprParser.Switch_caseContext ele : ctx.switch_case()) {
            caselist += visit(ele);
        }
        String switch_default = visit(ctx.switch_default()).visitString;
        Node node = new Node();
        node.visitString = "switch(" + condition + "){" + caselist + switch_default + "}";
        return node;
    }

    @Override
    public Node visitSwitch_case(LabeledExprParser.Switch_caseContext ctx) {
        String value = ctx.value.getText();
        String deal = "";
        for(LabeledExprParser.StatContext ele: ctx.stat()){
            deal +=visit(ele);
        }
        Node node = new Node();
        node.visitString = "case "+value+":"+deal;
        return node;
    }

    @Override
    public Node visitSwitch_default(LabeledExprParser.Switch_defaultContext ctx) {
        String deal = "";
        for(LabeledExprParser.StatContext ele: ctx.stat()){
            deal +=visit(ele);
        }
        Node node = new Node();
        node.visitString = "default : "+deal;
        return node;
    }


}
