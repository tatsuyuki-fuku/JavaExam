package jp.co.rakuspartners.java.basic.exam21;

public class Car {
    protected int speed;
    private String name;

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが"+speed+"km/hに増えました。");
    }

    void stepOnBrake(){
        speed = speed - 10;
        System.out.println("スピードが"+speed+"km/hに減りました。");
    }

   
}
