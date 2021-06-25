package Visitor.Pattern;

public class VistorA extends Visitor{

    @Override
    void runFunctionA(FunctionA function) {
        System.out.println("VistorA run FunctionA");
    }

    @Override
    void runFunctionB(FunctionB function) {
        System.out.println("VistorA run FunctionB");
    }
}
