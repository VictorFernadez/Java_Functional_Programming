package com.functional.lambda;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        onTheFly(()-> System.out.println("Hello!"));
    }
    public static void onTheFly(MyFunctionalInterface fun){
        fun.myMethod();
    }
}
