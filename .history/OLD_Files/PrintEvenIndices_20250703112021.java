import java.util.Scanner;

public class PrintEvenIndices {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printEvenInd(arr, 0);
    }
    public static void printEvenInd(int[] arr,int idx){
        if(idx>arr.length-1){
            return;
        }
        else{
            printEvenInd(arr,idx+2);

            System.out.print(arr[idx]);
            if(idx!=0 || idx!=1){
                System.out.print(" ");
            }
        }
    }
}
