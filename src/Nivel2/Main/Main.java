package Nivel2.Main;

import Nivel2.Modules.Input;

public class Main {
    public static void main (String[]args){
        Input sc= new Input();
        sc.inputByte("Cuantos años tienes?");
        sc.inputFloat("Cuanto dinero tienes?");
        sc.inputDouble("Cuantos dinero tienes?");
        sc.inputInt("Cuantos años tienes?");
    }
}
