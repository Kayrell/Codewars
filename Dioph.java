package kataExercises;

public class Dioph {
    public static String solEquaStr(long n) {
        String result = "[";
        int count = 0;
        int x;
        int y = 0;
        for (x = 0; x < n; x++) {
            for (y = 0; y < n; y++) {
                if((x^2 - 4 * y^2) == n && count == 0){
                    result = result + "[" + x + ", " + y + "], ";
                    count++;
                }
            }
        }
        if(count == 1){
            result = result + "[" + x + ", " + y + "]]";
        }
        return result;
    }
}
