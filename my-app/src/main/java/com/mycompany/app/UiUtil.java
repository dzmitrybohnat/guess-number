package com.mycompany.app;
import java.util.Scanner;

public class UiUtil{
    
    public static String readInputString(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        return stringInput;
    }

    public static int readNumberInput(String message) {
        boolean isValid = false;
        int scannedNumber = 0;
        do {
            try{
            scannedNumber = Integer.parseInt(readInputString(message));
            isValid = true;
            } catch (NumberFormatException e){
                System.out.println("Invalid number. Please try again");
            }

        } while (!isValid);

        return scannedNumber;
    }
}