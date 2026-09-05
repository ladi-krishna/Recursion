import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double avg = findAvg(arr, 0, 0);
        System.out.printf("%.6f", avg);

        sc.close();
    }

    public static double findAvg(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return (double) sum / arr.length;
        }
        else {
            System.out.println(sum);
            return findAvg(arr, i + 1, sum + arr[i]);
        }
    }
}
