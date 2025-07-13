package jp.co.rakuspartners.java.basic.exam13;

public class Car {
    int speed ;
    String name ;
    int gasoline ;

    Car(){}

    Car(int speed,String name, int gasoline){
        this.speed = speed;
        this.name = name;
        this.gasoline = gasoline;
    }

    void display(){
        System.out.println(name+"の速度は"+speed+"km/hでガソリンの残量は"+gasoline+"リットルです");
    }

    void stepOnAccele(){
        speed += 10 ;
        gasoline -= 10;
    }

    void stepOnBrake(){
        speed -= 10 ;
    }

    void refuel(int newGasoline){
        gasoline = newGasoline;
    }

}
