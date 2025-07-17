package jp.co.rakuspartners.java.basic.exam31;

public class OperatorException extends Exception{
    public OperatorException(String message) {
        super(message);
    }

    public OperatorException(Throwable cause){
        super(cause);
    }

    public OperatorException(String message,Throwable cause){
        super(message,cause);
    }
}
