package com.functional.lambda;

public class LambdaPractice1 {
    public static void main(String[] args) {
        Name name = () -> System.out.println("Jonn");
        name.myName();
    }
}
