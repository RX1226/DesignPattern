package Visitor.Pattern;

public class VistorB extends Visitor{

    @Override
    void runFunctionA(FunctionA function) {
        System.out.println("VistorB run FunctionA");
    }

    @Override
    void runFunctionB(FunctionB function) {
        System.out.println("VistorB run FunctionB");
    }
}
