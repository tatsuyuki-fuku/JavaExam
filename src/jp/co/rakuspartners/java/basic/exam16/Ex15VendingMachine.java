package jp.co.rakuspartners.java.basic.exam16;

public class Ex15VendingMachine {
    static final int PRICE = 120;
    int money = 0;
    int stock = 0;

    //商品の在庫を補充する
    void refillStock(int stock){
        if(stock>=10){
            System.out.println("商品がいっぱいです");
        }else{
            this.stock+=stock;
            System.out.println("在庫が"+this.stock+"個になりました");
        }
    }

    //お金を入れる
    void putMoney(int money){
        this.money+=money;
        System.out.println("入金金額が"+this.money+"円になりました");
    }

    //商品を購入
    void buyItem(){
        if(stock<=0){
            System.out.println("在庫を追加してください");
        }else if(money<=0){
            System.out.println("お金を入れてください");
        }else if(PRICE>money){
            System.out.println("お金が足りません(現在の残高"+money+"円)");
        }else{
            System.out.println("商品を購入しました");
            stock--;
            money-=PRICE;
            if(stock==0){
                System.out.println("在庫切れになりました");
            }
        }
    }
}
