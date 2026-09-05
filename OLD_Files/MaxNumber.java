package OLD_Files;
import java.util.*;
public class MaxNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getSum(arr,0,0));
        
    } 
    public static int getMax(int[] arr,int idx,int maxVal){
        if(idx==arr.length){
            return maxVal;
        }
        else{
            if(arr[idx]>maxVal){
                return getMax(arr,idx+1,arr[idx]);
            }
            else{
                return getMax(arr,idx+1,maxVal);
            }
        }
    }
    public static int getSum(int[] arr,int idx, int sum){
        if(idx==arr.length){
            return sum;
        }
        else{
            return getSum(arr,idx+1,sum+arr[idx]);
        }
    }
}
