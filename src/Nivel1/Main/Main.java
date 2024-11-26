package Nivel1.Main;

import Nivel1.Exceptions.EmptysSaleEx;
import Nivel1.Modules.Sales;

public class Main {
    public static void main(String[] args) {

        try {
            Sales sales = new Sales();
            sales.totalPrice();
        } catch (EmptysSaleEx e) {
            System.out.println("Exception captured " + e.getMessage());
        }
    }
}