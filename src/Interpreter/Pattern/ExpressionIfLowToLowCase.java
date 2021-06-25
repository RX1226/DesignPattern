package Interpreter.Pattern;

//如果字串有[LOW], 則將其翻譯成小寫
public class ExpressionIfLowToLowCase implements Expression{
    @Override
    public String interpret(String input) {
        if(input.contains("[LOW]"))
        return input.toLowerCase();
        else return input;
    }
}
