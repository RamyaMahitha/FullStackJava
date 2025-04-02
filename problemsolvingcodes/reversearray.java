import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int i=0,j=n-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        i++;
        j--;
        }
        for( i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
        
    }
    
}
