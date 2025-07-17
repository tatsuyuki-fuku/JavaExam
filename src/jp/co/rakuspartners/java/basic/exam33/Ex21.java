package jp.co.rakuspartners.java.basic.exam33;

import java.util.HashMap;
import java.util.Map;

public class Ex21 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("東京", "東京");
        map.put("埼玉", "さいたま");
        map.put("茨城", "水戸");
        map.put("沖縄", "那覇");

        String town=map.get("埼玉");
        if(town!=null){
            System.out.println("埼玉県の県庁所在地は「"+town+"」です");
        }

        String town2=map.get("沖縄");
        if(town!=null){
            System.out.println("埼玉県の県庁所在地は「"+town2+"」です");
        }
    }
}
