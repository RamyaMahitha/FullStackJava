import java.util.*;
public class targetsum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int target=sc.nextInt();
      int flag=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                System.out.println("Indices are "+i+" "+j+"  values are "+arr[i]+" "+arr[j]);
                flag=1;
                break;
            }
        }
        
      }
      if(flag==0){
        System.out.println("Target sum is Not found");
      }
  }  
}
