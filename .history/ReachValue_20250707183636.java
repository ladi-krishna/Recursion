
import java.util.Scanner;

public class ReachValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        if(canReach(n,1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean canReach(long N,long curr){
        if(curr==N){
            return true;
        }
        if(curr>N){
            return false;
        }

        if(canReach(N, curr*10)){
            return true;
        }
        if(canReach(N,curr*20)){
            return true;
        }
        return false;
    }

}
