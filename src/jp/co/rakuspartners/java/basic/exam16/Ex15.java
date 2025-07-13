package jp.co.rakuspartners.java.basic.exam16;

public class Ex15 {
    public static void main(String[] args) {
        Ex15VendingMachine a = new Ex15VendingMachine();
        a.buyItem();
        a.refillStock(3);
        a.buyItem();
        a.putMoney(500);
        a.buyItem();
        a.buyItem();
        a.buyItem();
        a.refillStock(3);
        a.buyItem();
        a.buyItem();
        a.buyItem();
    }
}
