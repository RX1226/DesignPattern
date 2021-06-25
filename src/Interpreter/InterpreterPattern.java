package Interpreter;

import Interpreter.Pattern.Expression;
import Interpreter.Pattern.ExpressionIfLowToLowCase;
import Interpreter.Pattern.ExpressionIfUpToUpCase;

/**
 * 解釋器/翻譯者模式 Interpreter Pattern
 * 定義語言的文法或語句, 使用解釋器來描述或表現
 * 有效能問題且部分功能可以用Pattern語法取代
 * 優點: 易於擴充和改變文法
 * 缺點: 複雜文法難以維護, 且執行效率低, 且使用時機難找
 */
public class InterpreterPattern {
    public static void main(String[] args) {
        Expression expression = new ExpressionIfLowToLowCase();
        System.out.println(expression.interpret("[LOW] Super Power"));

        expression = new ExpressionIfUpToUpCase();
        System.out.println(expression.interpret("[UP] AppLe keeps Doctor Away"));
    }
}
