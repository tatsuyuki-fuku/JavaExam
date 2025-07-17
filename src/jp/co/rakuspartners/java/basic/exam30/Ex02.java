package jp.co.rakuspartners.java.basic.exam30;

public class Ex02 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang. java.lang.NotFoundClass");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("クラスが見つかりません");
            e.printStackTrace();
        }
        
    }

}
