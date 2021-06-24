package Flyweight.Pattern;

import java.util.HashMap;

public class PlantFactory {
    private HashMap<String, Plant> hashMap = new HashMap<>();
    PlantFactory(){
        hashMap.put("tree", new Tree());
        hashMap.put("flower", new Flower());
    }
    public Plant getPlant(String type){
        return hashMap.get(type);
    }
}
