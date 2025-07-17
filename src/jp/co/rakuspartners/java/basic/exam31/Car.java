package jp.co.rakuspartners.java.basic.exam31;

public class Car {
    private int speed;

    public void run(int speed) throws IllegalArgumentException{
        if(0<speed&&speed>=180){
            throw new IllegalArgumentException("スピードの出し過ぎです");
        }else{
            this.speed=speed;
            System.out.println("スピードが"+this.speed+"になりました");
        }
    }
}
