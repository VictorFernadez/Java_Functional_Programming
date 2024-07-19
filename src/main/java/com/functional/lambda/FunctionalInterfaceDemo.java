package com.functional.lambda;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyFunInterface myFunInterface = () -> System.out.println("Hello!");
        myFunInterface.myMethod();
    }
}
