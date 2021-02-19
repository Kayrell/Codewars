package kataExercises;
// https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/java

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1 {
    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[]{1, 2, 3}, 4);
        for (int i = 0; i < twoSum.length; i++) {
            System.out.println(twoSum[i]);

        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] indexArray = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target){
                        if(i != j){
                            indexArray[0] = j;
                            indexArray[1] = i;
                        }

                    }
            }
        }
        return indexArray;
    }
    public static int[] twoSum1(int[] numbers, int target) {
        return IntStream.range(0, numbers.length - 1).filter(position ->
                IntStream.of(numbers).skip(position + 1)
                        .anyMatch(value -> (value + numbers[position]) == target))
                .flatMap(position -> IntStream.of(position, IntStream.of(numbers).boxed()
                        .collect(Collectors.toList()).lastIndexOf(IntStream.of(numbers).skip(position + 1)
                                .filter(value -> (value + numbers[position]) == target).findFirst().getAsInt()))).limit(2).toArray();
    }

    public static int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];

            if (map.containsKey(temp)) {
                return new int[]{i, map.get(temp)};
            }

            map.put(numbers[i], i);
        }
        throw new NoSuchElementException("Array doesn't have two elements with given sum");
    }
}
