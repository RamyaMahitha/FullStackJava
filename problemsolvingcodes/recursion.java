import java.util.*;
public class recursion{
    public static int rec(int n,int a){
        if(a==0){
            return 1;
        }
        else{
           return n*rec(n,a-1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int a=in.nextInt();
            int res=rec(n,a);
            System.out.println(res);
        }
        
}
    

