package Flyweight.Pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private Student student = new Student();
    List<String> studentNames = new ArrayList<>();

    public void addStudent(String name){
        studentNames.add(name);
    }

    public void showAllStudent(){
        for (String name : studentNames){
            student.showName(name);
        }
    }
}
