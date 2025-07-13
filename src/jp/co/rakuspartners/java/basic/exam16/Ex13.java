package jp.co.rakuspartners.java.basic.exam16;

public class Ex13 {
    public static void main(String[] args) {
        Ex13ElectricCar a = new Ex13ElectricCar();
        a.chargeToFull();
        a.powerOn();
        a.move("埼玉");
        a.move("東京");
        a.move("茨城");
        a.powerOn();
    }

}
