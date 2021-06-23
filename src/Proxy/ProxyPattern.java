package Proxy;

import Proxy.Pattern.Proxy;

/**
 代理模式 Proxy Pattern
 為其他物件提供一種代理來控制該物件的訪問
 有很多應用的方式
 像是控制Client訪問實體主機的權限
 優點: 可以擴充目標功能, 並可以保護物件
 缺點: 增加系統複雜度, 可能會造成延遲
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.print();
    }
}
