import java.util.*;
public class LeftMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=new int[n];
        res[0]=arr[0];
        leftMaxArr(arr, res, 1);
        System.out.print(Arrays.toString(res));
        sc.close();

    }
    public static void leftMaxArr(int[] arr,int[] res,int idx){
        if(idx==arr.length){
            return;
        }
        else{
            res[idx]=Math.max(arr[idx],res[idx-1]);
            leftMaxArr(arr, res, idx+1);
        }
        
    }
}
