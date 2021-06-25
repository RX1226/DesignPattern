package Interpreter.Pattern;

//如果字串有[UP], 則將其翻譯成大寫
public class ExpressionIfUpToUpCase implements Expression{
    @Override
    public String interpret(String input) {
        if(input.contains("[UP]"))
        return input.toUpperCase();
        else return input;
    }
}
