package com.functional.lambda;

public class LambdaExample1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread Executed!"));
        thread.start();
    }
}
