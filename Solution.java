package kataExercises;

public class Solution {

    public static void main(String[] args) {
        System.out.println(minimumNumber(new int[]{2,12,8,4,6}));
    }

    public static int minimumNumber(int[] numbers) {
        int sum = 0;
        int sum2 = 0;
        int minNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        while (minNum  != sum2 - sum){
            Solution checker = new Solution();
            sum2 += sum + 1;
            if(checker.checkSimple(sum2) == true){
                minNum = sum2 - sum;
            } else if (checker.checkSimple(sum2) == false){
                sum2 ++;
            }
        }
        return minNum; // Do your magic!
    }
    private static boolean checkSimple(int i){
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
