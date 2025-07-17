package jp.co.rakuspartners.java.basic.exam27_2;

public class Horse implements Animal{
    String a ="「whinny」";
    @Override
    public void cry(){
        System.out.println(a+"と鳴く");
    }
}
