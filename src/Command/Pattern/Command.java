package Command.Pattern;

public abstract class Command {
    Reciever receiver;
    Command(Reciever receiver){
        this.receiver = receiver;
    }
    public abstract void execute();
}