package kataExercises;

//  https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa/train/java
// ToDo - hasn't done yet

import java.util.ArrayList;
import java.util.List;

public class SumOfK {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(chooseBestSum(10, 3, list));
    }
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int result = 0;
        int sum = 0;
        int i1 = 0;
        for( int i = i1; i <= k; i++) {
            sum = sum + ls.get(i);
            if(sum > t){
                result = 0;
            } else  {
                i1++;
                result = sum;
            }
        }

        return result;
    }
}
