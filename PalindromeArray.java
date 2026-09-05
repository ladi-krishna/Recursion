import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(checkPalindrome(arr, 0, n-1)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
    public static boolean checkPalindrome(int[] arr,int i,int j){
        if(i>=j){
            return true;
        }
        else{
            if(arr[i]!=arr[j]){
                return false;
            }
            else{
                return checkPalindrome(arr, i+1, j-1);
            }
        }
    }

}
