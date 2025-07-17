package jp.co.rakuspartners.java.basic.exam31;

public class Ex01 {

    public static void method1() throws Exception{
        Class.forName("java.lang.NonExistClass");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("クラスが見つかりません");
        }
        
    }
}
