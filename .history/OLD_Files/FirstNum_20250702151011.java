
import java.util.*;
public class FirstNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printRec(n);
    } 
    public static void printRec(int n){
        if(n==0){
           
        }
        else{
            System.out.println("Recursion");
            n--;
            printRec(n);
            
        }
    }
}