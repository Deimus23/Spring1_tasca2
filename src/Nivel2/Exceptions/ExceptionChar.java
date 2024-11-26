package Nivel2.Exceptions;

public class ExceptionChar extends Exception {
    public ExceptionChar(String message) {
        super("Invalid input or input stream closed.");
    }
}
