package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        System.out.println("The nth term of the Fibonacci sequence is " +getFibonacci(10));
    }

    /**
     * This method counts the n-th term in the Fibonacci sequence.
     * @param n Number of the term you need in the Fibonacci sequence.
     * @return n-th term in the Fibonacci sequence..
     *
     * @author Alejandro Marin
     */
    public static int getFibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }

        return getFibonacci(n-1) + getFibonacci(n - 2);
    }
}
