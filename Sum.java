package kataExercises;
// https://www.codewars.com/kata/beginner-series-number-3-sum-of-numbers/train/java

public class Sum {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.GetSum(4, 2));
    }
    public int GetSum(int a, int b){
        int count = 0;
        if(a < b) {
            for (int i = a; i <= b; i++) {
                count += i;
            }
        } else{
            for (int i = b; i <= a; i++) {
                count += i;
            }
        }
        return count;
    }
}
