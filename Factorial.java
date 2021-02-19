package kataExercises;

import java.util.stream.Stream;

//https://www.codewars.com/kata/factorial/train/java
public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(13));

    }

    public static int factorial(int n) {
        if (n < 0 || n > 12){
            throw new IllegalArgumentException();}
        return Stream.iterate(1,  j-> j+1).limit(n).reduce(1, (a, b) -> a * b);
    }

}
