package kataExercises;

public class LargestDifference {

    public static void main(String[] args) {
        System.out.println(largestDifference(new int[]{9, 4, 1, 10, 3, 4, 0, -1, -2}));
    }


    public static int largestDifference(int[] data) {
        int diff = 0;
        int numOfEl1 = 0;
        int numOfEl2 = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(Math.abs(data[i] - data[j]) >= diff){
                    diff = Math.abs(data[i] - data[j]);
                    numOfEl1 = i;
                    numOfEl2 = j;
                }
            }
        }
        diff = Math.abs(numOfEl1 - numOfEl2 - 1);
        return diff;

    }


}
