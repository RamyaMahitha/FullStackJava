import java.util.*;
class setbit{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        if(((n>>k)&1) == 1){
            System.out.println("set bit");
        } 
        else{
            System.out.println("not a set bit");
        } 
    }
}