package jp.co.rakuspartners.java.basic.exam29;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        //以下　月の情報がないのでエラーになる。
        // String str ="2018年12日";
        // DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy年dd日");
        // LocalDateTime localDateTime=LocalDateTime.parse(str, formatter);
        // System.out.println(localDateTime);      
    
        LocalDate localDate=LocalDate.of(2000,01,22);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int date = localDate.getDayOfMonth();

        System.out.println("私の誕生日は"+year+"年"+month+"月"+date+"日"+"です");

    }
}
