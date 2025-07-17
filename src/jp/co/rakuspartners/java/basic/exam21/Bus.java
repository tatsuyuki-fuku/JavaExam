package jp.co.rakuspartners.java.basic.exam21;

public class Bus extends Car {
    int price ;

    @Override
    void stepOnAccele(){
        super.stepOnAccele();
        // speed = speed + 10;
        // System.out.println("スピードは"+speed+"km/hです");

        price += 30;
        System.out.println("料金は"+price+"円です");
    }
}
