import java.util.Scanner;

public class SplitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            long n = sc.nextLong();
            if (n == 0) {
                System.out.println("0 ");
            } else {
                printDigits(n);
                System.out.println();
            }
        }
        sc.close();
    }

    public static void printDigits(long n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        printDigits(n / 10);
        System.out.print((n % 10) + " ");
    }
}
