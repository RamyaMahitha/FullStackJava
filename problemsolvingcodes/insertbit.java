import java.util.*;
public class insertbit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int newnum=n|(1<<k);
        System.out.println(newnum);

    }
}
