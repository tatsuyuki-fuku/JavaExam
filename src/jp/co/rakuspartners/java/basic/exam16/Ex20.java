package jp.co.rakuspartners.java.basic.exam16;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arrays = new int[50];
        int sumArray=0;
        int count=0;

        for (int i = 0; i < arrays.length; i++) {
            System.out.println((i+1)+ "番目の数字");
            arrays[i] = s.nextInt();
            sumArray+=arrays[i];
            count++;
            if(sumArray>=100){
                break;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(arrays[i]+" ");
        }
        s.close();
    }
}
