package com.k.testing;

import com.k.testing.calculator.Calculator;
import com.k.testing.user.SimpleUser;

import java.util.Random;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calc = new Calculator();
        Random generator = new Random();
        int i = 0;
        int a;
        int b;

        while(i < 10) {
            a = generator.nextInt(10) + 1;
            b = generator.nextInt(10) + 1;
            if (calc.add(a, b) != a + b) {
                System.out.println("Sum: " + a + " and " + b + " is not: " + calc.add(a, b));
            }else {
                System.out.println("test OK, sum " + i);
            }
            i++;
        }
        i = 0;
        while(i < 10) {
            a = generator.nextInt(10) + 1;
            b = generator.nextInt(10) + 1;
            if (calc.subtract(a, b) != a - b) {
                System.out.println("Difference: " + a + " and " + b + " is not: " + calc.subtract(a, b));
            }else {
                System.out.println("test OK, difference " + i);
            }
            i++;
        }
    }
}
