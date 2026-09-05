import java.util.*;
public class FindVowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        System.out.println(returnVowelCount(s));
    }
    public static int returnVowelCount(String s){
        String[] sL=s.split(" ");
        // System.out.print(Arrays.toString(sL));
        int c=0;
        for(String i:sL){
            c+=helper(i,0,0);
        }
        return c;
    }
    public static int helper(String s,int idx,int count){
        if(idx==s.length()){
            return count;
        }
        else{
            if(s.charAt(idx)=='a' || s.charAt(idx)=='e' || s.charAt(idx)=='i' || s.charAt(idx)=='o' || s.charAt(idx)=='u' ){
                return helper(s,idx+1,count+1);
            }
            else{
                return helper(s,idx+1,count);
            }
            
        }
    }
}
