package jp.co.rakuspartners.java.basic.exam16;

public class Ex18 {
    public static void main(String[] args) {
        //配列を用いた蓮数の表示
        int[] num={0,1,2,3,4};
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        //名前の表示
        String[] name={"達之",null,null,null,"達之",null,null,null,null};
        for(int i=0;i<name.length;i++){
            if(name[i] == null){
                System.out.print("空 ");
            }else{
            System.out.print(name[i]+" ");
            }
        }



    }
}
