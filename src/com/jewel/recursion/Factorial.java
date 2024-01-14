package com.jewel.recursion;

public class Factorial {

    public static int factorial(int num){
        if(num == 1) return 1;

        return num * factorial(num -1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}

/*
        1 = factorial(1)
        2 * factorial(1)
        3 * factorial(2)
        4 * factorial(3)



 */