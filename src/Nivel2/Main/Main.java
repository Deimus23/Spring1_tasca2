package Nivel2.Main;

import Nivel2.Exceptions.ExceptionInput;
import Nivel2.Modules.Input;

public class Main {
    public static void main (String[]args) throws ExceptionInput {
        Input sc= new Input();
        sc.inputByte("Cuantos años tienes?");
        sc.inputFloat("Cuanto dinero tienes?");
        sc.inputDouble("Cuantos dinero tienes?");
        sc.inputInt("Cuantos años tienes?");
        sc.inputChar("Cual es la primera letra de tu nombre?");
        sc.inputString("Cual es tu nombre?");
        sc.inputBolean("Te gustan los coches ? yes/no");
    }
}
