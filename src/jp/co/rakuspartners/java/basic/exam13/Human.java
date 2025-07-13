package jp.co.rakuspartners.java.basic.exam13;

public class Human {
    String lastName;
    String firstName;
    int power;

    Human(){}

    Human(String lastName,String firstName,int power){
        this.lastName   =lastName;
        this.firstName  =firstName;
        this.power      =power;
    }

    public String toString (){
        return lastName+firstName+"さんのパワーは"+power+"です";
    }

    void sayMyName(){
        System.out.println("私の名前は"+lastName+firstName+"です。");
    }

    void eat(String food){
        if(food.equals("おにぎり")){
            power += 10;
            System.out.println("パワーは"+power+"になりました。");
        }else if(food.equals("カレー")){
            power += 20;
            System.out.println("パワーは"+power+"になりました。");
        }else{
            power += 5;
            System.out.println("パワーは"+power+"になりました。");
        }
    }

}
