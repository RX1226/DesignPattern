package Composite.Transpare.Parrern;

import java.util.ArrayList;
import java.util.List;

//和安全模式相同, 只是改成繼承
public class Composite extends Component {
    private List<Component> childComponents = new ArrayList<Component>();

    private String name;
    public Composite(String name){ this.name = name; }
    public void addChild(Component child){ childComponents.add(child); }
    public void removeChild(int index){ childComponents.remove(index); }
    public List<Component> getChild(){ return childComponents; }

    @Override
    public void printStruct(String struct) {
        System.out.println(struct + "+" + this.name);
        if(this.childComponents != null) {
            for (Component component : childComponents) {
                component.printStruct(struct);
            }
        }
    }
}
