package Composite.Transpare.Parrern;

import java.util.List;

public abstract class Component {
    public abstract void printStruct(String struct);

    public void addChild(Component child){
        throw new UnsupportedOperationException("not support");
    }

    public void removeChild(int index){
        throw new UnsupportedOperationException("not support");
    }

    public List<Component> getChild(){
        throw new UnsupportedOperationException("not support");
    }
}
