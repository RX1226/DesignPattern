package Command.Pattern;

public class RestCommand extends Command{
    public RestCommand(Reciever receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.stop();
    }
}
