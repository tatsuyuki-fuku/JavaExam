package jp.co.rakuspartners.java.basic.exam32;

import java.util.ArrayList;
import java.util.List;

public class Ex20 {
    public static void main(String[] args) {
        List<Employee> namelist = new ArrayList<>();
        namelist.add(new Employee("伊賀", 30));
        namelist.add(new Employee("山田", 30));
        namelist.add(new Employee("佐藤", 30));
        namelist.add(new Employee("田中", 30));

        namelist.remove(1);
        namelist.add(1, new Employee("鈴木", 30));

        System.out.println("３番目の社員は"+namelist.get(2)+"です");

        //ここはスーパークラスでtoString()を定義する必要あり
        for(Employee name:namelist){
            System.out.println(name);
        }
    }
}
