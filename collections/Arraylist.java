import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Arraylist{
        public static void main(String args[]){
        List<Integer> lis = new ArrayList<Integer>();
        lis.add(10);
        lis.add(12);
        lis.get(0);
        lis.remove(1);
        System.out.println(lis.size());
        System.out.println(lis.contains(10)); //true or false
        for(int i:lis){
            System.out.println(i+" ");
        }
    }
}