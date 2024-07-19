package com.functional.lambda;

public class LambdaExample1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Executed!");
            }
        });
        thread.start();
    }
}
