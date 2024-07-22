package com.functional.lambda;

public class LambdaPractice3 {
    public static void main(String[] args) {
        LengthOfString len = s -> s.length();
        System.out.println(len.length("Victor"));
    }
}
