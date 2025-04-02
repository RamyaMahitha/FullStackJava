public class spiralmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=arr.length;
        int c=arr[0].length;
        int l=0,t=0,ri=c-1,b=r-1;
        while(t<=b && l<=ri){
            for(int i=l;i<=ri;i++){
                System.out.print(arr[t][i]+" ");
            }
            t++;
            for(int i=t;i<=b;i++){
                System.out.print(arr[i][ri]+" ");
            }
            ri--;
            if(t<=b){
                for(int i=ri;i>=l;i--){
                    System.out.print(arr[b][i]+" ");
                }
            b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    System.out.print(arr[i][l]+" ");
            }
            l++;
        }
    }
       
    }
    
}
