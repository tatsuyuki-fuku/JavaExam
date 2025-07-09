package jp.co.rakuspartners.java.basic.exam5;

public class exam5_8 {
public static void main(String[] args) {
    int temp = 38;
    int cold = 37;
    int abnormal = 42;
    if(temp<=cold){
        System.out.println("正常");
    }else if (temp>cold && temp <= abnormal){
        System.out.println("風邪");
    }else{
        System.out.println("異常");
    }
}
}
