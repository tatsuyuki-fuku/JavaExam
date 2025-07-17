package jp.co.rakuspartners.java.basic.exam31;

public class Ex15 {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.run(40);
            car.run(200);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
}
