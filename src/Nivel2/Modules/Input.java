package Nivel2.Modules;

import Nivel2.Exceptions.ExceptionChar;

import java.util.Scanner;

public class Input {
    public Scanner sc = new Scanner(System.in);

    public byte inputByte(String message) {
        byte chose = 0;
        boolean exit = false;
        do {
            try {
                System.out.println(message);
                chose = sc.nextByte();
                sc.nextLine();
                exit = true;
            } catch (Exception InputMismatchException) {
                System.out.println("Error: Invalid input or input stream closed.");
                sc.nextLine();
            }
        } while (!exit);
        return chose;
    }

    public int inputInt(String message) {
        int chose = 0;
        boolean exit = false;
        do {
            try {
                System.out.println(message);
                chose = sc.nextInt();
                sc.nextLine();
                exit = true;
            } catch (Exception InputMismatchException) {
                System.out.println("Error: Invalid input or input stream closed.");
                sc.nextLine();
            }
        } while (!exit);
        return chose;
    }

    public float inputFloat(String message) {
        float chose = 0;
        boolean exit = false;
        do {
            try {
                System.out.println(message);
                chose = sc.nextFloat();
                sc.nextLine();
                exit = true;
            } catch (Exception InputMismatchException) {
                System.out.println("Error: Invalid input or input stream closed.");
                sc.nextLine();
            }
        } while (!exit);
        return chose;
    }

    public double inputDouble(String message) {
        double chose = 0;
        boolean exit = false;
        do {
            try {
                System.out.println(message);
                chose = sc.nextDouble();
                sc.nextLine();
                exit = true;
            } catch (Exception InputMismatchException) {
                System.out.println("Error: Invalid input or input stream closed.");
                sc.nextLine();
            }
        } while (!exit);
        return chose;
    }
 public char inputChar(String message){
        char character = 0;
        String chose;
        boolean exit = false;
        do{
            try{
                System.out.println(message);
                chose=sc.nextLine();
                sc.nextLine();
                if(chose.length()!=1) {
                    throw new ExceptionChar();
                }else{
                    chose.charAt(character);
                }
            }catch (ExceptionChar){

            }
        }while(!exit);
     return character;
 }


}
