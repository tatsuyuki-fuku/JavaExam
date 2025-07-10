package jp.co.rakuspartners.java.basic.exam12;

public class Ex49 {
    public static void main(String[] args) {
        System.out.println(calcTax(2000));
        System.out.println(calclncludTax(2000));
        System.out.println( calcHalfPrice(2000));
        System.out.println(calcTimeServicePrice(2000, 0.8));
    }

    static int calcTax (int price){
        int taxprice =(int)(price*0.1);
        return taxprice;
    }

    static int calclncludTax (int price){
        int total =  (int)(price*1.1);
        return total;
    }

    static int calcHalfPrice(int price){
        int helf = price/2;
        return helf;
    }

    static int calcTimeServicePrice(int price,double discountRate){
        int sellprice = (int)(price*discountRate);
        return sellprice;
    }
}
