package kataExercises;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.*;
import static kataExercises.Months.FEB;
import static kataExercises.Months.JANUARY;

public class SumOfOdd {
    public static void main(String[] args) {
        out.println(Stream.iterate(1L, n -> n + 1)
                .limit(10)
                .peek(n-> out.println("1 - " + n))
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Double.valueOf(n))
                .map(Math::sqrt)
                .peek(n -> out.println("2 -"+n))
//                .collect();
                .reduce((long)0, (sum, element) -> sum + element));
        Months month = JANUARY;
        out.println(month.getNumber());
        month = FEB;
        out.println(month.getNumber());

        if (month == JANUARY)  {
            out.println("This is Jan");
        } else  if (month ==  FEB) {
            out.println("This is   Feb");
        }
        Stream.of("XML", "Java",  "CSS")
                .peek(out::println)
                .flatMap(name ->  IntStream.range(0, name.length())
                        .peek(out::println)
                        .mapToObj(name::charAt))
                .forEach(out::println);

    }
}
enum Months {
    JANUARY (1),
    FEB (2);
    private  int number;
    Months(int number) {
       this.number  = number;
    };
    public int getNumber(){
            return number;
    }
}