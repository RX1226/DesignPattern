package Memento.Pattern;

public class Player {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento save(){
        System.out.println("存檔");
        return new Memento(state);
    }

    public void road(Memento memento){
        System.out.println("讀取");
        state = memento.getState();
    }
}
