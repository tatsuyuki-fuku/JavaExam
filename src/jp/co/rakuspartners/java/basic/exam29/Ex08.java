package jp.co.rakuspartners.java.basic.exam29;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2020, 2, 1);
        localDate=localDate.with(TemporalAdjusters.lastDayOfMonth());
        int date = localDate.getDayOfMonth();
        System.out.println(date);
        int i=1;
        if(i==1){

        }else if(i==2){
    
        }
    }


    
}
