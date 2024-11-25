package Nivel1;

public class Main {
    public static void main(String[] args) throws EmptysSaleEx {

        try {
            Sales sales = new Sales();
            sales.totalPrice();
        } catch (EmptysSaleEx e) {
            System.out.println("Excepció captured " + e.getMessage());
        }

    }
}