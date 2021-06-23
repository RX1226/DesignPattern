package State.Pattern;

public class Context {
    private State state;

    public Context(){
        state = new StateIdle();
    }
    void changeState(State state){
        this.state = state;
        this.state.Handle(this);
    }
    public void startWork(){
        changeState(new StateStart());
    }
}
