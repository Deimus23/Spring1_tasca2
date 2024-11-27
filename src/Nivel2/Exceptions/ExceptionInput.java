package Nivel2.Exceptions;

public class ExceptionInput extends Exception {
    public ExceptionInput(String message) {
        super("Invalid input or input stream closed.");
    }
}
