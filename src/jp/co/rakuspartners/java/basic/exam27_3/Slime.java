package jp.co.rakuspartners.java.basic.exam27_3;

public class Slime extends Monster {
    public Slime(int hp, String name){
        super(hp, name);
    }

    public void talk(String message){
        System.out.println(name+":「"+message+"」");
    }
}
