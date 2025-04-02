import java.util.Scanner;
class powerof2{
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int n=input.nextInt();
         int count=0;
         for(int i=0;i<8;i++){
            if(((n>>i)&1) == 1){
                count++;
            }
         }
         if(count==1){
            System.out.println("power of 2");
         }
         else{
            System.out.println("not a power of 2");
         }
    }
}