package com.functional.lambda;

public class LambdaPractice3 {
    public static void main(String[] args) {
        LengthOfString len = s -> {
            int l = s.length();
            System.out.println("Length of the String is " + l);
            return l;
        };
        len.length("Siti Tesfaye");
    }
}
