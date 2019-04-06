package HomeWork.Exeption;

public class MySizeArrayException extends RuntimeException{

    public MySizeArrayException(String s){
        super(s);
    }

    public MySizeArrayException(String operation, Throwable cause){
        this(operation);
    }
}
