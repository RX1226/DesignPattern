package Template.Pattern;

public abstract class MainFlow {
    public void flow(){
        flow1();
        flow2();
        flow3();
    }
    private void flow1(){
        System.out.println("step1");
    }
    abstract void flow2();
    private void flow3(){
        System.out.println("step3");
    }
}
