package Visitor.Pattern;

public class FunctionA extends Function{
    @Override
    void run(Visitor visitor) {
        visitor.runFunctionA(this);
    }
}
