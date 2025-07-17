package jp.co.rakuspartners.java.basic.exam32;

import java.util.ArrayList;
import java.util.List;

public class Ex19 {
    public static void main(String[] args) {
        List<String> namelist = new ArrayList<>();
        namelist.add("伊賀");
        namelist.add("山田");
        namelist.add("佐藤");
        namelist.add("田中");

        namelist.remove(1);
        namelist.add(1, "鈴木");

        System.out.println("３番目の社員は"+namelist.get(2)+"です");

        for(String name:namelist){
            System.out.println(name);
        }
    }
}
