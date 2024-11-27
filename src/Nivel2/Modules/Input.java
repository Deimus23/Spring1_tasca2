package Nivel2.Modules;

import Nivel2.Exceptions.ExceptionInput;

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

    public char inputChar(String message) throws ExceptionInput {
        char character = 0;
        String chose;
        boolean exit = false;
        do {
            try {
                System.out.println(message);

                chose = sc.nextLine();

                if (chose.length() != 1) {
                    throw new ExceptionInput("Invalid input or input stream closed.");
                } else {
                    chose.charAt(character);
                    exit = true;
                }
            } catch (ExceptionInput c) {
                System.out.println("Error: Invalid input or input stream closed.");

            }
        } while (!exit);
        return character;

    }

    public String inputString(String message) throws ExceptionInput {
        String character = "";
        String chose;
        boolean exit = false;
        do {
            try {
                System.out.println(message);
                chose = sc.nextLine();

                if (chose.length() != 1) {
                    chose = character;
                    exit = true;
                } else {
                    throw new ExceptionInput("Invalid input or input stream closed.");
                }
            } catch (ExceptionInput c) {
                System.out.println("Error: Invalid input or input stream closed.");

            }
        } while (!exit);
        return character;

    }

    public boolean inputBolean(String message) throws ExceptionInput {
        boolean character = false;
        String chose, yes = "y", no = "n";
        boolean exit = false;

        do {
            try {
                System.out.println(message);
                chose = sc.nextLine();
                chose.toLowerCase();

                if (chose.charAt(0) == yes.charAt(0)) {
                    character = true;
                    exit = true;
                } else if (chose.charAt(0) == no.charAt(0)) {
                    character = false;
                    exit = true;
                } else {
                    throw new ExceptionInput("Invalid input or input stream closed.");
                }
            } catch (ExceptionInput c) {
                System.out.println("Error: Invalid input or input stream closed.");

            }
        } while (!exit);
        return character;
    }


}
