import java.util.Scanner;
public class bubblesort {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int temp;
       int n1=n-1;
         while(n1-->1){
            int j=0;
            for(int i=0;i<n-1-j;i++){
                if(arr[i+1]<arr[i]){
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
            j++;
       }
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }


}
}