package OLD_Files;
import java.util.Scanner;

public class PrintLogN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       System.out.println(LogNVal(n));
       sc.close();
    }
    public static long LogNVal(long n){
        if(n<=1){
            return 0;
        }
        else{
            return 1+LogNVal(n/2);
        }

    }
}