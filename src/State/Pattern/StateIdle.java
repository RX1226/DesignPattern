package State.Pattern;

public class StateIdle extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("閒置中");
    }
}
