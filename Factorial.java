/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author HP
 */
public class Factorial {

    public static void main(String[] args) {
        int num = 5; // change this to the number you want to calculate the factorial for
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
