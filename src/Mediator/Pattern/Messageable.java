package Mediator.Pattern;

public interface Messageable {
    void receive(String msg);
    void send(String to, String msg);
}
