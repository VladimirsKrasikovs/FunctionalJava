package org.example.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
       int i = increamentByone(0);
        System.out.println(i);

        int i2 = incrementByOneFunction.apply(1);
        System.out.println(i2);

        int multiply = multipleBy10Function.apply(i2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1aTheMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1aTheMultiplyBy10.apply(4));

        //biFunction

        int i3 = increamentByoneAndMultiply(4, 100);
        System.out.println(i3);

        System.out.println(increamentByoneAndMultiplybyFunction.apply(4,100));
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number +1;

    static Function<Integer, Integer> multipleBy10Function =
            number -> number *10;

    static int increamentByone(int number){
        return number+1;
    }

   static BiFunction<Integer, Integer, Integer> increamentByoneAndMultiplybyFunction =
            (numberToIncrementByOne, numberTOMultipplyBy)
                    -> (numberToIncrementByOne+1) * numberTOMultipplyBy;

    static int increamentByoneAndMultiply(int number, int numToMultiply){
        return (number+1) *numToMultiply;
    }
}
