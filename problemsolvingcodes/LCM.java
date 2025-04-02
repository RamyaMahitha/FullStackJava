import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int num;
        if(n1<n2){
            num=n1;
        }
        else{
            num=n2;
        }
        int max=1;
        for(int i=2;i<=num;i++){
            if((n1%i==0)&&(n2%i==0)){
                int hcf=i;
                if(hcf>max){
                    max=hcf;
                }
            }

        }
        System.out.println("LCM of two numbers is "+(n1*n2)/max);

    }
    
}


    

