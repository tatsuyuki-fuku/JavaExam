package jp.co.rakuspartners.java.basic.exam16;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
         System.out.println(i + 1 + "番目の数字");
         num[i] = s.nextInt();
        }
    
        for(int i=0;i<num.length;i++){
            System.out.print(2*num[i]+" ");
        }
        System.out.println();
    
        //偶数表示
        System.out.print("偶数：");
        for(int i=0;i<num.length;i++){   
            if(num[i]%2==0){
            System.out.print(num[i]+" ");
        }
        }
        //改行
        System.out.println();
    
        //奇数表示
        System.out.print("奇数：");
        for(int i=0;i<num.length;i++){
        if(num[i]%2==1){
            System.out.print(num[i]+" ");
        }
        }
    s.close();    
    }
}