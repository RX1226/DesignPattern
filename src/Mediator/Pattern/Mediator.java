package Mediator.Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mediator {
    private Map<String, Messageable> users = new HashMap<>();

    public void addUser(String name, Messageable user){
       users.put(name, user);
    }

    public void reply(String to, String message){
        for (String name : users.keySet()){
            if(name.equals(to)){
                users.get(name).receive(message);
            }
        }
    }
}
