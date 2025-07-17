package jp.co.rakuspartners.java.basic.exam27_2;

public class Bear implements Animal{
    String a ="「roar」";
    @Override
    public void cry(){
        System.out.println(a+"と鳴く");
    }
}
