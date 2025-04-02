import java.math.*;
public class parkinglot {
    public static void main(String[] args) {
        char[] arr={'X','X','S','X','S','X','X','X','S','X','X','S','S','S','S','S','X','X'};
       /* int n=arr.length;
        int max=0,count;
        for(int i=0;i<n;i++){
            if(arr[i]=='S'){
                count=1;
                for(int j=i+1;j<n;j++){
                    if(arr[j]=='S')
                       count++;
                    else  
                     break;
                }
                if(count>max){
                   max=count;
                   count=0;
            }
        }
        }
        System.err.println(max); */
        int max=0,count=0;
        for(char c:arr){
            if(c=='S'){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
        
    }
    
}
