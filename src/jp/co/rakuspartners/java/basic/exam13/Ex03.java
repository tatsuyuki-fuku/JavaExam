package jp.co.rakuspartners.java.basic.exam13;

public class Ex03 {
    public static void main(String[] args) {
        //自分
        Human myHuman = new Human();

        myHuman.lastName="福嶋";
        myHuman.firstName="達之";

        myHuman.sayMyName();
        myHuman.eat("おにぎり");
        
        //友達の処理
        Human frendHuman = new Human();

        frendHuman.lastName="友";
        frendHuman.firstName="達";

        frendHuman.sayMyName();
        frendHuman.eat("カレー");

    }
}
