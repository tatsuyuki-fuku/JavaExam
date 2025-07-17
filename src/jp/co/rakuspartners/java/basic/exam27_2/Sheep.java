package jp.co.rakuspartners.java.basic.exam27_2;

public class Sheep implements Animal{
    String a ="「baa」";
    @Override
    public void cry(){
        System.out.println(a+"と鳴く");
    }
}
