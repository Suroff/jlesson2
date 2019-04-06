package Lesson2;

class WrongOperationException extends Exception {

    public WrongOperationException(String operation){
        super("Неверная операция " + operation);
    }

    public WrongOperationException(String operation, Throwable cause){
        this(operation);
    }


}
