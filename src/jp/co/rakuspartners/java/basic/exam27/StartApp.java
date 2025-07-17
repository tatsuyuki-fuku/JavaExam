package jp.co.rakuspartners.java.basic.exam27;

public class StartApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.showType();
        dog.setName("ポチ");
        dog.showName();
        dog.eat();

        Cat cat = new Cat();
        
        cat.showType();
        cat.setName("タマ");
        cat.showName();
        cat.eat();

        Human human = new Human();
        
        human.showType();
        human.setName("山田");
        human.showName();
        human.eat();

        Mouse mouse = new Mouse();

        mouse.showType();
        mouse.setName("チュー");
        mouse.showName();
        mouse.eat();
    }

}
