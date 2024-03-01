package org.example.proxyExtends;

public class BuyerProxy extends Buyer{
    Buyer buyer;

    public BuyerProxy(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public void buy() {
        // 在代理类中可以实现更多业务层面之外的逻辑
        System.out.println("Proxy Buyer");
        buyer.buy(); // 代理类中调用被代理类的方法
    }

    public static void main(String[] args) {
        new BuyerProxy(new Buyer()).buy();
    }
}
