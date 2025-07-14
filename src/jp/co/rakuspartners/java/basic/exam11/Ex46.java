package jp.co.rakuspartners.java.basic.exam11;

public class Ex46 {
public static void main(String[] args) {
    System .out.println(add(5,3));
    System .out.println(sub(5,3));
    System .out.println(multi(5,3));
    System .out.println(div(5,3));
}

//以下からメソッド(返り値ありver　voidのところがデータ型になる)
static int add (int num1,int num2){
    int sum = num1+num2;
    return sum;
}

static int sub (int num1,int num2){
    int a =num1-num2;
    return a;
}

static int multi (int num1,int num2){
    int b =num1*num2;
    return b;
}

static int div (int num1,int num2){
    int c =num1/num2;
    return c;
}
}
