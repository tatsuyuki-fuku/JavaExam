package jp.co.rakuspartners.java.basic.exam29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex10 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2020,7,27);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd/");
        String format = localDate.format(formatter);
        System.out.println(format);
    }
}
