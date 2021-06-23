package State;

import State.Pattern.Context;

/**
 狀態模式 State Pattern
 利用狀態的改變來操作物件不同的行為
 使用狀態改變來調整複雜的邏輯行為
 */
public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context();
        context.startWork();
    }
}
