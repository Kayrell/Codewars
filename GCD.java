package kataExercises;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class GCD {
    public static int compute(int x, int y) {
        ArrayList<Integer> xD = new ArrayList<>();
        ArrayList<Integer> yD = new ArrayList<>();
        do{
            if(x  % 2 == 0){
                x = x/2;
                xD.add(2);
            }else{
                x= x/x;
                xD.add(x);
            }
            if(y % 2 == 0){
                y = y/2;
                yD.add(2);
            }else{
                y = y/y;
                yD.add(y);
            }
        }  while(x != 1);
        do{
            if(y % 2 == 0){
                y = y/2;
                yD.add(2);
            }else{
                y = y/y;
                yD.add(y);
            }
        }  while(y != 1);


//        public static OptionalInt solution (int[] A, int[] B) {
            return IntStream.of(Integer.parseInt(xD.toString())).filter(a -> IntStream.of(Integer.parseInt(yD.toString())).anyMatch(b -> a == b)).max().getAsInt();
//                    of(xD).filter(a -> IntStream.of(yD).anyMatch(b -> a == b)).max();
        //ToDo this string returns max value of both ArrayLists. Warrior, your mission hasn't been completed yet! Your task is to find all values that are included in ArrayLists! P S it will be a Loop i suppose)
    }
}
