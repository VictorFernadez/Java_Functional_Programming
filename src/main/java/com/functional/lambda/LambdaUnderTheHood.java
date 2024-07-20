package com.functional.lambda;

public class LambdaUnderTheHood {
    public static void main(String[] args) {
        MyFunctionalInterface fun = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation 1");
            }
        };
        MyFunctionalInterface fun2 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation 2");
            }
        };
    }
}
