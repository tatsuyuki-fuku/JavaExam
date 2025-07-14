package jp.co.rakuspartners.java.basic.exam12;

public class Ex48 {
    public static void main(String[] args) {
        amount(3);
        System.out.println(amount(10));//ここにはメソッド内のsumが入る
    }
    
    //戻り値ありのメソッド
    static int amount (int a){
        int sum = 0;
        System.out.println(sum);
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        return sum;//ここの値が返される
        
    }
}
