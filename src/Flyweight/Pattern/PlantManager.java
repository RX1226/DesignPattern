package Flyweight.Pattern;

import java.util.ArrayList;
import java.util.List;

public class PlantManager {
    private PlantFactory factory = new PlantFactory();
    private List<String> types = new ArrayList<>();
    private List<String> plants = new ArrayList<>();

    public void addPlant(String type, String name){
        types.add(type);
        plants.add(name);
    }

    public void showAllPlant(){
        for(int i = 0; i < plants.size(); i++){
            factory.getPlant(types.get(i)).showName(plants.get(i));
        }
    }
}
