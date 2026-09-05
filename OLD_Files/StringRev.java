package OLD_Files;
// package Recursion
public class StringRev {
    public static void main(String[] args) {
        revStr("Hello",0);
    }
   
    public static void revStr(String s,int idx){
        if(idx>=s.length()){
            return;
        }
        else{
            revStr(s, idx+1);
            System.out.print(s.charAt(idx));
        }
    }
}
