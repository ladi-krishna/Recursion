package OLD_Files;
import java.util.*;
public class SuffixSum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(calSum(arr, n-1, m, 0,0));
    }

    public static int calSum(int[] arr,int idx,int m,int sum,int i){
        if(i==m){
            return sum;
        }
        else{
         return calSum(arr,idx-1,m,sum+arr[idx],i+1);
        }
        
    }
}
