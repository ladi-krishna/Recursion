package OLD_Files;
import java.util.*;
public class Patterns{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       printPyramid(n, n);
       sc.close();
    }
    public static void printPyramid(int total,int cur){
        if(cur<=0){
            return;
        }
        else{
            printSpaces(total-cur);
            printStars(2*cur - 1);
            System.out.println();
            printPyramid(total,cur-1);
        }
    }
    public static void printSpaces(int spaces){
            if(spaces==0){
                return;
            }
            else{
                System.out.print(" ");
                printSpaces(spaces-1);
            }
    }
    public static void printStars(int count){
            if(count==0){
                return;
            }
            else{
                System.out.print("*");
                printStars(count-1);
            }
    }

}