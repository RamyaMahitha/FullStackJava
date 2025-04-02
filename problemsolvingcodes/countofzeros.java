public class countofzeros {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,1};
        int n=arr.length;
        int l=0,h=n-1,mid;
        while(l<h){
            mid=(l+h)/2;
            if(arr[mid]==0){
                l=mid+1;
            }
            else if(arr[mid]==1){
                h=mid-1;
            }
    
        }
    System.out.println(l);
    }
    
}
