package jp.co.rakuspartners.java.basic.exam27_2;

public class Monkey implements Animal{
    String a ="「yack-yack」";
    @Override
    public void cry(){
        System.out.println(a+"と鳴く");
    }
}
