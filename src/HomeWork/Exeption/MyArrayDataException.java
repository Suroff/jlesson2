package HomeWork.Exeption;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String s){
        super(s);
    }

    public MyArrayDataException(String operation, Throwable cause){
        this(operation);
    }
}