package jp.co.rakuspartners.java.basic.exam16;

import java.util.Scanner;

public class Ex20_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] array = new int[50];
        int sumArray=0;

        int i = 0;
        do {
            System.out.println((i + 1) + "番目の数字:");
            array[i] = s.nextInt();
            sumArray += array[i];
            i++;
        } while (sumArray < 100 && i < array.length);

        for(int j =0;j<i;j++){
            System.out.print(array[j]+" ");
        }
        s.close();
    }
}