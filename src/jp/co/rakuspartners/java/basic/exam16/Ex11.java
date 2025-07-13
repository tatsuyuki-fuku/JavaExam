package jp.co.rakuspartners.java.basic.exam16;

public class Ex11 {
    public static void main(String[] args) {
        int[] numbers = {5,6,1,3,9};

        //①
        System.out.println(numbers[3]);

        //②
        for(int number : numbers){
            System.out.print(number);
        }
        System.out.println();

        //③
        for(int i=0;i<numbers.length;i++){
            int j =numbers.length-1;
            System.out.print(numbers[j-i]);
        }
        System.out.println();

        //④
        for(int number:numbers){
            if(number%2==1){
                System.out.print(number);
            }
        }
        System.out.println();

        //⑤
        int count=0;
        for(int number:numbers){
            if(number%2==0){
                count++;
            }
        }
        System.out.println(count);

        //⑥
        int max = numbers[0];
        int min = numbers[0];
        for(int number:numbers){
            if(max<number){
                max=number;
            }else if(min>number){
                min=number;
            }
        }
        System.out.println("最大値:"+max+"/最小値:"+min);

    }
}
