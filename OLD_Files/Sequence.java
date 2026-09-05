package OLD_Files;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
     Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();
      System.out.println(giveSeq(var2,0));
      var1.close();
    }
    public static int giveSeq(int n,int c){
        if(n==1){
            c=c+1;
            return c;
        }
        else{
            if(n%2==0){
                return giveSeq(n/2,c+1);
            }
            else{
                return giveSeq(3*n+1,c+1);
            }
        }
    }
}
