package jp.co.rakuspartners.java.basic.exam16;

public class Ex16 {
    public static void main(String[] args) {
        Ex16Triathlete a = new Ex16Triathlete();
        a.move("サイクリングロード");
        a.changeTool("自転車");
        a.training();
        a.move("海");
        a.changeTool("シューズ");
        a.training();
        a.move("公園");
        a.changeTool("シューズ");
        a.training();
    }
}
