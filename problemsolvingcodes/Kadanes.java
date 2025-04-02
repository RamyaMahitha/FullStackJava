import java.util.*;
public class Kadanes {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    int max=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<n;i++){
        if(sum<0){
            sum=0;
        }
        else{
            sum+=arr[i];
            if(max<sum){
                max=sum;
            }
        }
    }
    System.out.println(max);
}}
