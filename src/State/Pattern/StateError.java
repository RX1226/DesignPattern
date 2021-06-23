package State.Pattern;

public class StateError extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("錯誤");
        context.changeState(new StateIdle());
    }
}
