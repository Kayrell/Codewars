package kataExercises;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.codewars.com/kata/55caf1fd8063ddfa8e000018/train/java
public class Progression {

    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1, 2, 5));
        System.out.println(arithmeticSequenceElements1(1,2,5));
    }

    public static String arithmeticSequenceElements(int first, int step, long total) {
        if(total == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(first);
        for (int i = 1; i < total; i++) {
            first = first + step;
            if (total - i == 1) {
                result.append(", " + first);
            } else{
                result.append(", " + first);
            }
        }
        return result.toString();
    }
    public static String arithmeticSequenceElements1(int first, int step, long total) {
        return Stream.iterate(first, n -> n+step).limit(total).map(String ::valueOf).collect(Collectors.counting()).toString();
    }

}
