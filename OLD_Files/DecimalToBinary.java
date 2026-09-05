package OLD_Files;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            long n = sc.nextLong();
            if (n == 0) {
                System.out.println("0");
            } else {
                Convert(n);
                
            }
        }
        sc.close();
    }
    public static void Convert(long n){
        if(n==0 || n==1){
            System.out.print(n);
        }
        else{
            Convert(n/2);
            System.out.print(n%2);
        }
    }
}
