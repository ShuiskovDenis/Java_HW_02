package org.example.hw;

public class Main {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.name = "Denis_Shuiskov";

        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}
