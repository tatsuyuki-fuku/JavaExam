package jp.co.rakuspartners.java.basic.exam13;

public class Ex05 {
    public static void main(String[] args) {
        Human yamada = new Human("山田","太郎",100);
        Human sato   = new Human("佐藤","一郎",20);

        System.out.println(yamada.toString());
        System.out.println(sato.toString());
    }
}
