package Chain;

import Chain.Pattern.Handler;
import Chain.Pattern.HandlerLevel01;
import Chain.Pattern.HandlerLevel05;
import Chain.Pattern.Issue;

/**
 * 責任鏈模式 Chain of Responsibility Pattern
 * 將許多物件串成鏈, 需求物件傳遞進來後, 沒法處理就往下傳遞
 * 優點: 低耦合高擴充, 每個物件符合單一原則
 * 缺點: 需求不一定會被處理, 過多鏈可能會影響效能
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Handler handler = new HandlerLevel01();
        handler.setNextHandler(new HandlerLevel05());
        handler.handleIssue(new Issue("低難度題", 1));
        handler.handleIssue(new Issue("中難度題", 5));
        handler.handleIssue(new Issue("高難度題", 9));
    }
}
