package Proxy.Pattern;

public class Proxy implements workable{
    private Server server = new Server();
    @Override
    public void print() {
        prePrint();
        server.print();
    }

    private void prePrint(){
        System.out.println("準備列印");
    }
}
