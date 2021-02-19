package kataExercises;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RemovedNumbers {

    public static void main(String[] args) {
//        System.out.println(RemovedNumbers.removNb(26));
        RemovedNumbers.removNb(26).stream().forEach(e -> {
            System.out.println(e[0]);
            System.out.println(e[1]);
        });
    }

    public static List<long[]> removNb(long n) {
        List<long[]> list = new ArrayList<>();
        long product = (long) (0.5 * n * (n + 1) + 1);
        for (long a = 1; a < n ; a++) {
            if(product % a == 0){
                long b = product/a;
                if(b < n){
                    list.add(new long[]{product / a - 1, a - 1});
                }

            }
        }
        Collections.sort(list, new Comp());
        return list;
    }

}
class Comp implements Comparator<long[]> {

    @Override
    public int compare(long[] o1, long[] o2) {
        return  (int) (o1[0] - o2[0]);
    }
}
