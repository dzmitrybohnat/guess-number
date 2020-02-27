package com.mycompany.app;
import java.util.Random;

public class MathUtil{
    
    public static int generateRandomNumber(int maxValue) {
        Random rand = new Random();
        return rand.nextInt(maxValue);
    }
}