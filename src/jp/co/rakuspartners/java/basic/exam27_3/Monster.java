package jp.co.rakuspartners.java.basic.exam27_3;

public class Monster extends Character implements Appear{
    //コンストラクタ
    public Monster(int hp, String name){
        super(hp,name);
    }
    //実装
    public void show(){
        System.out.println(name+"が現れた！");
        System.out.println(name+"の現在のHP:"+hp);
    }

}
