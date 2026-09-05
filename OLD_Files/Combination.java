package OLD_Files;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        double r=sc.nextDouble();
        
        if(r>n){
            System.out.print(0);
        }
        else
        System.out.print((long)getComb(n,r,1));
        sc.close();
    }
    public static double getComb(double n,double r,double res){
        
        if(r==0){
            return res;
        }
        else{
            res =(res*n)/r;
            System.out.println(res);
            return getComb(n-1,r-1,res);
        }
    }
}
