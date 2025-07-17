package jp.co.rakuspartners.java.basic.exam27_2;

public class Goat implements Animal{
    String a ="「bleat」";
    @Override
    public void cry(){
        System.out.println(a+"と鳴く");
    }
}
