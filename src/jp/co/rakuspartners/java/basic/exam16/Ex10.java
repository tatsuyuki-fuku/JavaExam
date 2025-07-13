package jp.co.rakuspartners.java.basic.exam16;

public class Ex10 {
public static void main(String[] args) {
    String[] frends = { "一郎", "次郎", "三郎", "四郎", "五郎", "六郎", "七郎" };
    for(String frend : frends){
        System.out.println(frend+"さん");
    }
    for(int i = 0;i<frends.length;i++){
        System.out.println(frends[i]+"さん");
    }
}
}
