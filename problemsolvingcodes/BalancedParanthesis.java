import java.util.*;
public class BalancedParanthesis {
    public static void main(String[] args) {
        String str="[(){]}";
        boolean flag=true;
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)=='{') || (str.charAt(i)=='[') || (str.charAt(i)=='(')){
                st.push(str.charAt(i));
            }
            else{
                    if(st.isEmpty()){
                        flag=false;
                        break;
                    }
                       char top=st.pop();
                       if((str.charAt(i)=='}' && top!='{') || (str.charAt(i)==']' && top!='[') || (str.charAt(i)==')' && top!='(')){
                        flag=false;
                }
            }
        }
        if(!st.isEmpty() || flag==false)
             System.out.println(" Not a balanced paranthesis");
        else
            System.out.println("balanced paranthesis");

    }
    
}
