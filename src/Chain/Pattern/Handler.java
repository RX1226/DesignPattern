package Chain.Pattern;

public abstract class Handler {
    private Handler nextHandler;
    protected String name;
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    public Handler getNextHandler(){
        return nextHandler;
    }
    public abstract void handleIssue(Issue issue);
}
