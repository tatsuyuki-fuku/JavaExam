package jp.co.rakuspartners.java.basic.exam30;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int answer = 10/0;
            System.out.println(answer);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("0で割ることができません");
            e.printStackTrace();
        }
        
        
    }

}
