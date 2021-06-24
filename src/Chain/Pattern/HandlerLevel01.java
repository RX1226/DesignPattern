package Chain.Pattern;

public class HandlerLevel01 extends Handler{
    @Override
    public void handleIssue(Issue issue) {
        if(issue.level > 1){
            //不能處理就往後丟
            if(getNextHandler() != null) {
                getNextHandler().handleIssue(issue);
            }else {
                System.out.println(issue.name + " can't solve ");
            }
        }else {
            System.out.println("Handler Level 01 solve " + issue.name);
        }
    }
}
