package jp.co.rakuspartners.java.basic.exam31;

public class Calculation {
    public static int execute(int firstNum,char operator,int secondNum)throws OperatorException {
        switch(operator){
            case '+':
                 return firstNum+secondNum;
            case '-':
                return firstNum-secondNum;
            case '*':
                return firstNum*secondNum;
            case '/':
                if(secondNum==0){
                    throw new OperatorException("0で割ることはできません");
                }
                return firstNum/secondNum;
            default:
                throw new OperatorException("不正な演算子が入力されています");
        }

        // int result=0;
        // if(secondNum==0){
        //     throw new OperatorException("0で割ることはできません");
        // }else if(operator=='+'){
        //     result=firstNum+secondNum;
        // }else if(operator=='-'){
        //     result=firstNum-secondNum;
        // }else if(operator=='*'){
        //     result=firstNum*secondNum;
        // }else if(operator=='/'){
        //     result=firstNum/secondNum;
        // }else{   
        //     throw new OperatorException("不正な演算子が使われました");
        // }

        // return result;
    }

    

}
