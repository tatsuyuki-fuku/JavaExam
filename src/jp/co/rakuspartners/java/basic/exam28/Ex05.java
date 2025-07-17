package jp.co.rakuspartners.java.basic.exam28;

public class Ex05 {
    public static void main(String[] args) {
        String bigNumber = "阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量大数(むりょうたいすう)";
        String[] Numbers =bigNumber.split(":");
        for(String Number : Numbers){
            System.out.println(Number);
        }
    }
}
