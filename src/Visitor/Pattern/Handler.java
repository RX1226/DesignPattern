package Visitor.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Handler {
    private List<Function> list = new ArrayList<>();

    public void runFunction(Visitor visitor){
        for (Function function : list){
            function.run(visitor);
        }
    }

    public void addFunction(Function function){
        list.add(function);
    }

    public void removeFunction(Function function){
        list.remove(function);
    }
}
