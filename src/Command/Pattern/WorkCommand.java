package Command.Pattern;

public class WorkCommand extends Command{
    public WorkCommand(Reciever receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.start();
    }
}
