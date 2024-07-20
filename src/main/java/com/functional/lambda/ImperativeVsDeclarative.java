package com.functional.lambda;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        //Imperative
        int sumOfEvents = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                sumOfEvents++;
//            }
//        }
//        System.out.println(sumOfEvents);

        //Declarative or Functional
        sumOfEvents = IntStream.rangeClosed(0,100)
                .filter(value -> value % 2 == 0)
                .reduce(Integer::sum)
                .getAsInt();
        System.out.println(sumOfEvents);
    }
}
