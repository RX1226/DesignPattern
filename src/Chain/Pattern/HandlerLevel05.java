package Chain.Pattern;

public class HandlerLevel05 extends Handler{
    @Override
    public void handleIssue(Issue issue) {
        if(issue.level > 5){
            System.out.println(issue.name + " can't solve ");
        }else {
            System.out.println("Handler Level 05 solve " + issue.name);
        }
    }
}
