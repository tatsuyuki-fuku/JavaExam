package jp.co.rakuspartners.java.basic.exam16;

public class Ex21 {
    public static void main(String[] args) {
        //二次元配列の定義
        int[][] num = new int[9][9];
        //System.out.println(num.length);

        //二次元配列に数値を代入
        for(int i = 0;i<num.length;i++){
            for(int j = 0;j<num[i].length;j++){
                num[i][j]=(i+1)*(j+1);
            }
        }

        //二次元配列の出力
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                if(num[i][j]<10){
                System.out.print(" "+num[i][j]+" ");
              }else{
                System.out.print(num[i][j]+" ");
              }  
            }
            System.out.println();
        }
    }
}
