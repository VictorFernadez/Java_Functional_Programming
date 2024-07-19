package com.functional.lambda;

public class LambdaExample1 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Thread Executed!");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
