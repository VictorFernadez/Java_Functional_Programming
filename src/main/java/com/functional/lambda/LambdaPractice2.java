package com.functional.lambda;

public class LambdaPractice2 {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> System.out.println(a + b);
        add.operation(2,8);

        MathOperation multiply = (a,b) -> System.out.println(a * b);
        multiply.operation(2,6);
    }
}
