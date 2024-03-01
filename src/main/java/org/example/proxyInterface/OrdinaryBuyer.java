package org.example.proxyInterface;

public class OrdinaryBuyer implements TicketBuyer
{
    @Override
    public void buy() {
        System.out.println("Ordinary Buyer");
    }
}
