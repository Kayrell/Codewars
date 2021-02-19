package kataExercises;

public class Xbonacci {
    public static void main(String[] args) {
        Xbonacci x = new Xbonacci();
        System.out.println(x.xbonacci(new double[]{0, 1}, 10));
    }
    public double[] xbonacci(double[] signature, int n) {
        int inLength = signature.length;
        double[] output = new double[n];
        for (int i = 0; i < inLength; i++) {
            output[i] = signature[i];
        }

        for (int i = 0; i < n - inLength; i++) {
            double  nextElement = sum(output, i, inLength + i -1);
            output[inLength + i] = nextElement;
        }
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
        return output;
    }

    private double sum(double[] arr, int i, int  k) {
        double sum = 0;
        for (int j = i; j <= k; j++) {
            sum +=  arr[j];
        }
        return sum;
    }
}
