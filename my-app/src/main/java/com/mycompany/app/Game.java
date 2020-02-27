package com.mycompany.app;

public class Game {

    private static final int MAX_VALUE = 51;

    public void start() {

         int digit;

        do {
            int randomNumber = MathUtil.generateRandomNumber(MAX_VALUE);
            
            do {
                digit = UiUtil.readNumberInput("Please input your number: ");

            } while (!compare(digit, randomNumber));

        } while (!exitApplication());

    }

    private boolean compare(int digit, int randomNumber) {

        if (digit > MAX_VALUE) {
            System.out.println("Your number is greater than max value");
            return false;
        } else if (digit == randomNumber) {
            System.out.println("BINGO!!!");
            return true;
        } else if (digit < randomNumber) {
            System.out.println("Your number is less");
            return false;
        } else if (digit > randomNumber) {
            System.out.println("Your number is greater");
            return false;
        }
        return false;
    }

    private boolean exitApplication() {
        String continueGame = UiUtil.readInputString("Would you like to play again? Input 'N' to exit: ");
        if (continueGame.equalsIgnoreCase("N")) {
            System.out.println("Buy!");
            return true;
        } else {
            System.out.println("Let's go!");
            return false;
        }
    }

}

// generate random number
// input number to guess
// compare input with guessed number
// exit criteria

// random number in a range from 0 to 50
// if number is greater then print 'smaller...'
// if number is smaller then print 'greater...'
// if equal then bingo
// offer to continue