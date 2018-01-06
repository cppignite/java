import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] arr = new double[5];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double avg = 0;

        System.out.println("Input 5 numbers, press enter after each number: ");

        for (int i = 0; i < 5; i++) {
            arr[i] = kb.nextDouble();
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (double val : arr) {
            avg += val;
        }

        avg = avg/arr.length;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
    }
}
