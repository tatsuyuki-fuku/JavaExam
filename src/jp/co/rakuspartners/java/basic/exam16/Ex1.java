package jp.co.rakuspartners.java.basic.exam16;

public class Ex1 {
    public static void main(String[] args) {
        int num =10;
        add10(num);
        System.out.println("main()メソッド内の値:"+num);
    }

    static void add10(int newNum){
        newNum = newNum + 10;
        System.out.println("add10()のメソッド内の値:"+newNum);
    }
}
