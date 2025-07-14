package jp.co.rakuspartners.java.basic.exam11;

public class Ex47 {
public static void main(String[] args) {
    System.out.println(average(79, 80, 100));//aveの値が返ってくる
}

//メソッド
static double average(int a,int b,int c){
    double ave =((a+b+c)/3.0);
    return ave;//aveの値が返される
}
}
