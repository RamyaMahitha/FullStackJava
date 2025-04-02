import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int key=in.nextInt();
        int low=0,high=n-1;
        int mid=(low+high)/2;
        while(low<high){
        if(arr[mid]==key){
            System.out.println("key element "+key+" is found at index: "+mid);
        }
        else if(key>arr[mid]){
            low=mid+1;
        }
        else if(key<arr[mid]){
            high=mid-1;
        }
    }
    }
}
