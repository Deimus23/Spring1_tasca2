package Nivel2.Main;

import Nivel2.Exceptions.ExceptionInput;
import Nivel2.Modules.Input;

public class Main {
    public static void main (String[]args) throws ExceptionInput {
        Input sc= new Input();
        System.out.println("your byte:"+sc.inputByte("Input byte:"));
        System.out.println("your float:"+sc.inputFloat("Input float:"));
        System.out.println("your double:"+sc.inputDouble("Input double:"));
        System.out.println("your int:"+sc.inputInt("Input int:"));
        System.out.println("your char:"+sc.inputChar("Input char:"));
        System.out.println("your string:"+sc.inputString("Input String:"));
        System.out.println("your boolean:"+sc.inputBolean("Input boolean:"));
    }
}
