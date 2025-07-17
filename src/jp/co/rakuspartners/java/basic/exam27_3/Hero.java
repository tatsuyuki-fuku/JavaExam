package jp.co.rakuspartners.java.basic.exam27_3;

public class Hero extends Character implements Appear{
    //コンストラクタ
    public Hero(int hp, String name){
        super(hp,name);
    }
    
    //勇者の情報を表示する
    public void show(){

        System.out.println("勇者"+name+"の登場！");
        System.out.println(name+"の現在のHP:"+hp);
    }
}
