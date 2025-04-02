import java.util.Scanner;
public class sortedarray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                flag= false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    
}
