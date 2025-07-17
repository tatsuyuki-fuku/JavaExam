package jp.co.rakuspartners.java.basic.exam27_3;

public class StartApp {
    public static void main(String[] args) {
        Hero hero = new Hero(20, "ロト");
        hero.show();

        Slime slime= new Slime(10, "メタルスライム");
        slime.show();

        slime.attack(hero);
        slime.talk("ぽよよよ〜ん。");
    }
}
