package jp.co.rakuspartners.java.basic.exam28;

public class Ex06 {
    public static void main(String[] args) {
        Human human = new Human();

        human.setName("福嶋達之");
        human.setAge(25);
        human.setBirthplace("埼玉");
        System.out.println(human.toString());
    }
}
