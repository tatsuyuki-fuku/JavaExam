package jp.co.rakuspartners.java.basic.exam21;

public class Car {
    int speed;
    String name;

    void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが"+speed+"km/hに増えました。");
    }

    void stepOnBrake(){
        speed = speed - 10;
        System.out.println("スピードが"+speed+"km/hに減りました。");
    }
}
