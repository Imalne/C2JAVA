import com.sun.xml.internal.ws.config.management.policy.ManagementPolicyValidator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import sun.security.krb5.internal.PAData;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EvalVisitor extends LabeledExprBaseVisitor<String> {

    Map<String,String> key_type = new HashMap<String, String>();
    Map<String,String> func_type = new HashMap<String,String>();
    @Override
    public String visitProg(LabeledExprParser.ProgContext ctx) {
        String main_code = visitMainDecl(ctx.mainDecl());
        String normalFunc = "";
        for (LabeledExprParser.NormalFuncContext ele : ctx.normalFunc()) {
            normalFunc += visitNormalFunc(ele);
        }
        return "public class Main {public static void main(String[] args) {_main(args.length,args);}" + main_code + normalFunc + '}';
    }


    @Override
    public String visitMainDecl(LabeledExprParser.MainDeclContext ctx) {
        String type = visit(ctx.type());
        String func_name = "_main";
        String parameters = "";
        if (ctx.parameters() != null)
            parameters = visit(ctx.parameters());
        String block = visit(ctx.block());
        return "public static " + type + ' ' + func_name + "(int argc,String[] args)" + block;
    }

    @Override
    public String visitNormalFunc(LabeledExprParser.NormalFuncContext ctx) {
        String type = visit(ctx.type());
        String func_name = ctx.ID().getText();
        String parameters = visit(ctx.parameters());
        this.func_type.put(func_name,type);
        String block = visit(ctx.block());
        return "public static " + type + ' ' + func_name + '(' + parameters + ')' + block;
    }

    @Override
    public String visitSingleVariable(LabeledExprParser.SingleVariableContext ctx) {
        String type = visit(ctx.type());
        String id = ctx.ID().getText();
        this.key_type.put(id,type);
        String extern = "";
        if (ctx.getChildCount() == 4) {
            extern += ctx.getChild(2).getText();
            extern += visit(ctx.expr());
        }
        return type + " " + id + " " + extern;
    }

    @Override
    public String visitArrayVariable(LabeledExprParser.ArrayVariableContext ctx) {
        String type = visit(ctx.type());
        String id = ctx.ID().getText();
        String len = ctx.INT().getText();
        this.key_type.put(id,type+"[]");
        return type + "[] " + id + "= new " + type + '[' + len + ']';
    }

    @Override
    public String visitArrayInitVariable(LabeledExprParser.ArrayInitVariableContext ctx) {
        String type = visit(ctx.type());
        String id = ctx.ID().getText();
        this.key_type.put(id,type+"[]");
        String initValues = ctx.arrayInitValues().getText();
        String len;
        String declare = "";
        if (ctx.INT() == null) {
            if (ctx.arrayInitValues().expr() != null) {
                declare = type + "[] " + id + "=" + visit(ctx.arrayInitValues().expr());
                return declare;
            }
            return type + "[] " + id + "=" + initValues;
        } else
            len = ctx.INT().getText();
        declare = type + "[] " + id + "= new " + type + '[' + len + "]";
        if (ctx.arrayInitValues().stringArrayInit() != null) {
            List<TerminalNode> list = ctx.arrayInitValues().stringArrayInit().CHAR();
            int length = list.size();
            for (int i = 0; i < length; i++) {
                declare += ";";
                declare += id + '[' + String.valueOf(i) + "]=" + list.get(i).getText();
            }
        } else if (ctx.arrayInitValues().intArrayInit() != null) {
            List<TerminalNode> list = ctx.arrayInitValues().intArrayInit().INT();
            int length = list.size();
            if (length == 1 && list.get(0).getText().equals("0")) {
                declare += ";for(int i = 0;i<" + len + ";i++)" + id + "[i]=0";
                return declare;
            }
            for (int i = 0; i < length; i++) {
                declare += ";";
                declare += id + '[' + String.valueOf(i) + "]=" + list.get(i).getText();
            }
        } else if (ctx.arrayInitValues().stringArrayInit() != null) {
            List<TerminalNode> list = ctx.arrayInitValues().boolArrayInit().BOOL();
            int length = list.size();
            for (int i = 0; i < length; i++) {
                declare += ";";
                declare += id + '[' + String.valueOf(i) + "]=" + list.get(i).getText();
            }
        } else if (ctx.arrayInitValues().expr() != null) {
            declare = type + "[] " + id + "=" + visit(ctx.arrayInitValues().expr());
        }
        return declare;
    }

    @Override
    public String visitParameters(LabeledExprParser.ParametersContext ctx) {
        String parameters_code = "";
        String parameter_code = "";
        for (LabeledExprParser.ParameterContext ele : ctx.parameter()) {
            parameter_code = visit(ele);
            parameters_code += ',' + parameter_code;
        }
        return parameters_code.substring(1);
    }

    @Override
    public String visitParameter(LabeledExprParser.ParameterContext ctx) {
        String type = "";
        String id = "";
        id = ctx.ID().getText();
        type = visit(ctx.type());
        return type + ' ' + id;
    }

    @Override
    public String visitBlock(LabeledExprParser.BlockContext ctx) {
        String block = "";
        for (LabeledExprParser.StatContext ele : ctx.stat()) {
            block += visit(ele);
        }
        return '{' + block + '}';
    }


    @Override
    public String visitNewBlock(LabeledExprParser.NewBlockContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public String visitVariableDeclare(LabeledExprParser.VariableDeclareContext ctx) {
        return visit(ctx.valDecl()) + ';';
    }

    @Override
    public String visitIf(LabeledExprParser.IfContext ctx) {
        String condition = visit(ctx.expr());
        String if_deal = visit(ctx.stat(0));
        String elseif = "";
        String else_deal = "";
        for (LabeledExprParser.ElseifContext ele : ctx.elseif()) {
            elseif += visit(ele);
        }
        if (ctx.stat().size() > 1) {
            else_deal = "else" + visit(ctx.stat(1));
        }
        return "if(" + condition + ")" + if_deal + elseif + else_deal;
    }

    @Override
    public String visitElseif(LabeledExprParser.ElseifContext ctx) {
        String condition = "";
        String elseif_deal = "";
        condition = visit(ctx.expr());
        elseif_deal = visit(ctx.stat());
        return "else if(" + condition + ")" + elseif_deal;
    }

    @Override
    public String visitFor(LabeledExprParser.ForContext ctx) {
        return visitForLoop(ctx.forLoop());
    }

    @Override
    public String visitWhile(LabeledExprParser.WhileContext ctx) {
        return visitWhileLoop(ctx.whileLoop());
    }

    @Override
    public String visitReturn(LabeledExprParser.ReturnContext ctx) {
        String return_content = "";
        if (ctx.expr() != null) {
            return_content = visit(ctx.expr());
        }
        return "return " + return_content + ";";
    }

    @Override
    public String visitVariableAssign(LabeledExprParser.VariableAssignContext ctx) {
        return visitAssign(ctx.assign()) + ';';
    }

    @Override
    public String visitStatExpr(LabeledExprParser.StatExprContext ctx) {
        return visit(ctx.expr()) + ";";
    }

    @Override
    public String visitAssign(LabeledExprParser.AssignContext ctx) {

        return visit(ctx.expr(0)) + '=' + visit(ctx.expr(1));
    }

    @Override
    public String visitForLoop(LabeledExprParser.ForLoopContext ctx) {
        String condition_1 = "";
        String condition_2 = "";
        String condition_3 = "";
        if (ctx.valDecl() != null) {
            condition_1 = visit(ctx.valDecl());
            condition_2 = visit(ctx.expr(0));
            condition_3 = visit(ctx.expr(1));
        } else {
            condition_1 = visit(ctx.assign());
            condition_2 = visit(ctx.expr(0));
            condition_3 = visit(ctx.expr(1));
        }
        String content = visit(ctx.stat());
        return "for(" + condition_1 + ';' + condition_2 + ';' + condition_3 + ')' + content;
    }

    @Override
    public String visitWhileLoop(LabeledExprParser.WhileLoopContext ctx) {
        String condition = visit(ctx.expr());
        String content = visit(ctx.stat());
        return "while(" + condition + ")" + content;
    }

    @Override
    public String visitParentheses(LabeledExprParser.ParenthesesContext ctx) {
        return "(" + visit(ctx.expr()) + ")";
    }

    @Override
    public String visitString(LabeledExprParser.StringContext ctx) {
        if (ctx.parent instanceof LabeledExprParser.ValDeclContext) {
            System.out.printf("yes");
        }
        return ctx.STRING().getText() + ".toCharArray()";
    }

    @Override
    public String visitBool(LabeledExprParser.BoolContext ctx) {
        return ctx.BOOL().getText();
    }

    @Override
    public String visitBitwiseAnd(LabeledExprParser.BitwiseAndContext ctx) {
        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitMulAndDiv(LabeledExprParser.MulAndDivContext ctx) {
        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitLogical_cp(LabeledExprParser.Logical_cpContext ctx) {
        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitInt(LabeledExprParser.IntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitNegative(LabeledExprParser.NegativeContext ctx) {
        return "- " + visit(ctx.expr());
    }

    @Override
    public String visitByteShift(LabeledExprParser.ByteShiftContext ctx) {
        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitNegate(LabeledExprParser.NegateContext ctx) {
        return "! " + visit(ctx.expr());
    }

    @Override
    public String visitIncreaseAndDecreaseAfter(LabeledExprParser.IncreaseAndDecreaseAfterContext ctx) {
        return visit(ctx.expr()) + ctx.op.getText();
    }

    @Override
    public String visitConsoleInt(LabeledExprParser.ConsoleIntContext ctx) {
        String var = visit(ctx.expr());
        String s = "try {";
        String t = " = (char) System.in.read();} catch (Exception e) {e.printStackTrace();}";

        return s + var + t;
    }


    @Override
    public String visitIncreaseAndDecreaseBefore(LabeledExprParser.IncreaseAndDecreaseBeforeContext ctx) {
        return ctx.op.getText() + visit(ctx.expr());
    }

    @Override
    public String visitFuncCall(LabeledExprParser.FuncCallContext ctx) {
        String func_name = ctx.ID().getText();
        String parameters = "";
        if (ctx.exprList() != null)
            parameters = visit(ctx.exprList());
        return func_name + "(" + parameters + ")";
    }

    @Override
    public String visitId(LabeledExprParser.IdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitConsoleOut(LabeledExprParser.ConsoleOutContext ctx) {
        String printf = "System.out.printf(";
        String format = ctx.STRING().getText();
        String parameters = "";
        if (ctx.exprList() != null) {
            parameters += ',';
            parameters += visit(ctx.exprList());
        }
        return printf + format + parameters + ")";
    }

    @Override
    public String visitSelfPlusAndSub(LabeledExprParser.SelfPlusAndSubContext ctx) {
        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitArrayAccess(LabeledExprParser.ArrayAccessContext ctx) {
        return visit(ctx.expr(0)) + '[' + visit(ctx.expr(1)) + ']';
    }

    @Override
    public String visitPlusAndSub(LabeledExprParser.PlusAndSubContext ctx) {
        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitExprList(LabeledExprParser.ExprListContext ctx) {
        String expr_list = "";
        for (LabeledExprParser.ExprContext ele : ctx.expr()) {
            expr_list += ',' + visit(ele);
        }
        return expr_list.substring(1);
    }

    @Override
    public String visitType(LabeledExprParser.TypeContext ctx) {
        String type = ctx.VTYPE().getText();
        if (type.equals("bool"))
            type = "boolean";
        if (ctx.getChildCount() != 1) {
            type += "[]";
        }
        return type;
    }

    @Override
    public String visitChar(LabeledExprParser.CharContext ctx) {
        return ctx.CHAR().getText();
    }

    @Override
    public String visitSwitch(LabeledExprParser.SwitchContext ctx) {
        String condition = visit(ctx.expr());
        String caselist = "";
        for (LabeledExprParser.Switch_caseContext ele : ctx.switch_case()) {
            caselist += visit(ele);
        }
        String switch_default = visit(ctx.switch_default());
        return "switch(" + condition + "){" + caselist + switch_default + "}";
    }

    @Override
    public String visitSwitch_case(LabeledExprParser.Switch_caseContext ctx) {
        String value = ctx.value.getText();
        String deal = "";
        for(LabeledExprParser.StatContext ele: ctx.stat()){
            deal +=visit(ele);
        }
        return "case "+value+":"+deal;
    }

    @Override
    public String visitSwitch_default(LabeledExprParser.Switch_defaultContext ctx) {
        String deal = "";
        for(LabeledExprParser.StatContext ele: ctx.stat()){
            deal +=visit(ele);
        }
        return "default : "+deal;
    }


}
