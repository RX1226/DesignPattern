package Mediator.Pattern;

public class MessagerA implements Messageable{
    private Mediator mediator;
    public MessagerA(Mediator mediator){
        this.mediator = mediator;
    }
    @Override
    public void receive(String message) {
        System.out.println("A receive: " + message);
    }

    @Override
    public void send(String to, String message) {
        System.out.println("Send " + to + " message: " + message);
        mediator.reply(to, message);
    }
}
