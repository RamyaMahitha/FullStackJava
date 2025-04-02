import java.lang.Math;
public class balancedString {
    public static void main(String[] args) {
        String s="][[]][[]][";
        int balance=0;
        int maxunbalanced=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                balance--;
            }
            else if(s.charAt(i)=='['){
                balance++;
            }
        if(balance<maxunbalanced ){
            maxunbalanced=balance;
        }
        }
    System.out.println(Math.abs(maxunbalanced+1)/2);
    }
    
}
