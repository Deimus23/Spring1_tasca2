package Nivel1.Exceptions;

public class EmptysSaleEx extends Exception {

    public EmptysSaleEx(String message) {
        super("To calculate the total sales, first you need to add products");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
