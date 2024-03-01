package org.example.proxyInterface;

public class OrdinaryBuyerProxy implements TicketBuyer { // 代理类和被代理类实现同一个接口
    private TicketBuyer ticketBuyer; // 通过组合的方式获取被代理类对象

    public OrdinaryBuyerProxy(TicketBuyer ticketBuyer) {
        this.ticketBuyer = ticketBuyer;
    }
    @Override
    public void buy() {
        System.out.println("Buyer Proxy");
        ticketBuyer.buy();
    }

    public static void main(String[] args) {
        new OrdinaryBuyerProxy(new OrdinaryBuyer()).buy();
    }
}
