package Visitor.Pattern;

public class FunctionB extends Function{
    @Override
    void run(Visitor visitor) {
        visitor.runFunctionB(this);
    }
}
