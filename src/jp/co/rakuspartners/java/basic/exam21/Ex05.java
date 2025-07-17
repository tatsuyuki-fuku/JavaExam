package jp.co.rakuspartners.java.basic.exam21;

public class Ex05 {
    public static void main(String[] args) {
        Car car = new Car();
    
        car.setName("エスティマ");
        car.setSpeed(30);
        System.out.println("現在のスピード:"+car.getSpeed());
        System.out.println("名前:"+car.getName());
    }
}
