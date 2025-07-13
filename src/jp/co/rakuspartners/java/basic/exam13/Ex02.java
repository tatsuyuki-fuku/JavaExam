package jp.co.rakuspartners.java.basic.exam13;

public class Ex02 {
    public static void main(String[] args) {
        Car estima = new Car();
        Car prius = new Car();

        estima.speed = 50;
        estima.name  ="エスティマ";

        prius.speed = 30;
        prius.name  ="プリウス";

        estima.stepOnAccele();
        estima.stepOnAccele();
        estima.stepOnBrake();
        System.out.println(estima.name+"の現在の速度は"+estima.speed+"km/hです。");

        for(int i=1;i<=5;i++){
            prius.stepOnAccele();
        }
        for(int i=1;i<=3;i++){
            prius.stepOnBrake();
        }
        System.out.println(prius.name+"の現在の速度は"+prius.speed+"km/hです。");
    }
}
