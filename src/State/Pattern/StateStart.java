package State.Pattern;

public class StateStart extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("開始");
        context.changeState(new StateBusy());
    }
}
