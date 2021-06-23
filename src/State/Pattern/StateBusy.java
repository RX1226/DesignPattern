package State.Pattern;

import java.util.Random;

public class StateBusy extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("忙碌中");
        if(new Random().nextInt(10) > 5) {
            System.out.println("任務成功");
            context.changeState(new StateIdle());
        }else {
            System.out.println("任務失敗");
            context.changeState(new StateError());
        }
    }
}
