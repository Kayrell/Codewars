package kataExercises;

public class ConvertNumbers {
    public static void main(String[] args) {
        int[] digitize = digitize(2345);
        for (int i = 0; i < digitize.length; i++) {
            System.out.println(digitize[i]);

        }
        char k = 'k';
        char l =  'l';
        if (k < l ) System.out.println("true");
    }
    public static int[] digitize(long n) {
        Long l= new Long(n);
        String s = l.toString();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        int[] arr = new int[stringBuilder.length()];
        for (int i = 0; i < stringBuilder.length(); i++) {
//            arr[i] = Integer.valueOf(stringBuilder.substring(i,i+1));;
            Character c = stringBuilder.charAt(i);
            arr[i] = Integer.valueOf(c.toString());
        }
        return arr;
    }
}
