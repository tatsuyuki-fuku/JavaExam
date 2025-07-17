package jp.co.rakuspartners.java.basic.exam27_3;

public class Character {
    //フィールド
    int hp;
    String name;

    //コンストラクタ
    public Character(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    //操作
    //HPを表示する
    void showHp(){
        System.out.println(name+"の現在のHP:"+hp);
    }

    //引数で受け取ったキャラが攻撃する
    void attack(Character ch){
        System.out.println(name+"のこうげき!");
        ch.hp-=5;
        if(ch.hp<=0){
            ch.hp=0;
        }
        System.out.println(ch.name+"の現在のHP:"+ch.hp);
    }

    //HPを減らす
    public void downHp(int hp){
        this.hp-=hp;
        if(this.hp<=0){
            this.hp=0;
        }
    }

}
