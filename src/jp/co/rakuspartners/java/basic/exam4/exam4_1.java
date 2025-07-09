package jp.co.rakuspartners.java.basic.exam4;

public class exam4_1 {
    public static void main(String[] args) {
        int item1 = 500;
        int item2 = 350;
        int tax = 10;
        System.out.println("小計合計");
        System.out.println((item1*4+item2*8)+"円");
        System.out.println("消費税");
        System.out.println((int)((item1*4+item2*8)*((double)tax/100))+"円");
        System.out.println("合計金額");
        System.out.println((int)((item1*4+item2*8)*(1+(double)tax/100))+"円");
    }
}
