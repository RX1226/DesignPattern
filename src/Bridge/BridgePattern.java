package Bridge;

import Bridge.Pattern.ColorBlack;
import Bridge.Pattern.ColorRed;
import Bridge.Pattern.PersonBlackHair;
import Bridge.Pattern.PersonRedHair;

/**
 橋樑模式 Bridge Pattern
 利用把屬性抽象化來將各種相似類別的物件過多的問題
 優點: 調整屬性的實作時不會影響到類別, 而且實作去除耦合性
 缺點: 如果屬性選項很多時會變得很複雜
 */
public class BridgePattern {
    public static void main(String[] args) {
        PersonBlackHair personBlackHair = new PersonBlackHair();
        personBlackHair.setHairColor(new ColorBlack());

        PersonRedHair personRedHair = new PersonRedHair();
        personRedHair.setHairColor(new ColorRed());
    }
}
