import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if((n&1)==1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }
    
}
