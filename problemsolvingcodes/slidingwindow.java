import java.util.*;
public class slidingwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int sum=0;
        int targetsum=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
          sum+=arr[i];
        }
        int flag=0;
        if(sum==targetsum){
          System.out.println("found ");
          flag=1;
        }
        else{
        for(int i=1;i<=n-k;i++){
           sum=sum-arr[i-1]+arr[i+k-1];
          // System.out.println(sum);
           if(sum==targetsum){
            System.out.println("found");
            flag=1;
            break;
           }

        }
      }
      if(flag==0){
        System.out.println("Target sum not found");
      }
        
        
    }
}
    

