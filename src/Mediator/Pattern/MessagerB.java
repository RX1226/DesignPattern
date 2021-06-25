package Mediator.Pattern;

public class MessagerB implements Messageable{
    private Mediator mediator;
    public MessagerB(Mediator mediator){
        this.mediator = mediator;
    }
    @Override
    public void receive(String message) {
        System.out.println("B receive: " + message);
    }

    @Override
    public void send(String to, String message) {
        System.out.println("Send " + to + " message: " + message);
        mediator.reply(to, message);
    }
}
