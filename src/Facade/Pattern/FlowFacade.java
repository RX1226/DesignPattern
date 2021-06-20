package Facade.Pattern;

public class FlowFacade {
    Flow1 flow1 = new Flow1();
    Flow2 flow2 = new Flow2();
    public void todo(){
        flow1.todo();
        flow2.todo();
    }
}
