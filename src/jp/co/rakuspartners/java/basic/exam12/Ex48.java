package jp.co.rakuspartners.java.basic.exam12;

public class Ex48 {
    public static void main(String[] args) {
        System.out.println(amount(10));
    }

    static int amount (int a){
        int sum = 0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        return sum;
    }
}
