package jp.co.rakuspartners.java.basic.exam8;

public class exam8_9 {
 public static void main(String[] args) {
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=1;i<=3;i++){
        for(int j=1;j<=4-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
 }
}
