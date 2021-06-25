package Memento;

import Memento.Pattern.Keeper;
import Memento.Pattern.Player;

/**
 * 備忘錄模式 Memento Pattern
 * 讓使用者儲存物件狀態, 必要時回到之前狀態
 * 且維持封裝原則
 * 優點: 儲存物放在外面, 使資料不易被破壞
 * 缺點: 讀檔或存檔可能耗時, 已有serialization機制存系統狀態
 */
public class MementoPattern {
    public static void main(String[] args) {
        Player player = new Player();
        Keeper keeper = new Keeper();
        player.setState("變身前");
        System.out.println("玩家狀態: " + player.getState());
        keeper.setMemento(player.save());
        player.setState("變身後");
        System.out.println("玩家狀態: " + player.getState());
        player.road(keeper.getMemento());
        System.out.println("玩家狀態: " + player.getState());
    }
}
