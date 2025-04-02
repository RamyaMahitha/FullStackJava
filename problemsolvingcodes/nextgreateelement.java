import java.util.*;
public class nextgreateelement {
    public static void main(String[] args) {
        int arr[]={3,10,5,6,7,9,8,2};
        int n=arr.length;
        int res[]=new int[n];
        Arrays.fill(res,-1);
      /* for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }  // for the next greater element  */
       /*  for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[(i+j)%n]>arr[i]){
                    res[i]=arr[(i+j)%n];
                    break;
                }
            }
        }   Next greater element in a circular motion */

        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i%n]){
                res[stack.pop()]=arr[i%n];
            }
            if(i<n){
                stack.push(i);
            }
        } // using stack
    for(int i=0;i<n;i++){
        System.out.print(res[i]+" ");
    }

    }
    
}
