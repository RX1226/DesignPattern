package Command.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new ArrayList<>();
    public void setCommand(Command command){
        commands.add(command);
    }
    public void executeCommand(){
        for (Command command: commands){
            command.execute();
        }
    }
}
