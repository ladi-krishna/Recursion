package OLD_Files;
import java.util.*;
public class NumInRevOrder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNum(n);
    } 
    public static void printNum(int n){
        if(n==0){
           return;
        }
        else{
            System.out.print(n);
            if(n!=1){
            System.out.print(" ");
            }
            printNum(n-1);
            
        }
    }
}