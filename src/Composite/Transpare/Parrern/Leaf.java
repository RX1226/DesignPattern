package Composite.Transpare.Parrern;

//和安全模式相同, 只是改成繼承
public class Leaf extends Component {
    private String name;
    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void printStruct(String struct) {
        System.out.println(struct + "-" + name);
    }
}
