package kataExercises;

import java.util.stream.Stream;

public class MostDigits {
    public static void main(String[] args) {
        int[] ints = new int[] {8, 900, 500};
        System.out.println(findLongest(ints));

        Stream<String> stream  = Stream.<String>builder()
                .add("XML")
                .add("Java")
                .build();
        stream.forEach(System.out::println);
//        Stream.iterate(1L, n  ->  n  + 1)
//                .forEach(System.out::println);
//        Stream.generate(Math::random)
//                .map(x  -> 10* x)
//                .mapToInt(Double::intValue)
//                .limit(10)
//                .forEach(System.out::println);
        Stream.generate(MostDigits::supl)
                .limit(10)
                .forEach(System.out::println);

    }
    static int i=0;
    private static int supl(){
        i++;
        int l =  2*i*i;
        return l;
    }

    public static int findLongest(int[] numbers) {
        int max = 0;
        int maxNumber =  0;
        for (int i = 0; i < numbers.length; i++) {
            int number = Math.abs(numbers[i]);
            String num1 = String.valueOf(number);
            if (num1.length() > max){
                max = num1.length();
                maxNumber = numbers[i];
            }

        }
        return maxNumber;
    }

}

