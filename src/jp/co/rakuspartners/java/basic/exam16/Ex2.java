package jp.co.rakuspartners.java.basic.exam16;

public class Ex2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 10;
        addSpeed10(car);
        System.out.println("main()メソッド内のspeedの値:"+car.speed);
    }

    static void addSpeed10(Car newCar){
        newCar.stepOnAccele();
        System.out.println("addSpeed10()メソッド内のspeedの値:"+newCar.speed);
    }
}
