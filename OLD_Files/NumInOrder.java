package OLD_Files;

import java.util.*;
public class NumInOrder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNum(n);
    } 
    public static void printNum(int n){
        if(n==0){
           
        }
        else{
            printNum(n-1);
            System.out.println(n);
        }
    }
}