package Observer.Pattern;

public class Soldier implements Observer{
    private int id;
    public Soldier(int id){
        this.id = id;
    }
    @Override
    public void update() {
        System.out.println("My id is " + id);
    }
}
