import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class stack{
        public static void main(String args[]){
        Stack<Integer> lis = new Stack<>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        lis.pop();
        System.out.println(lis);
        lis.size();
        lis.remove(0);
        lis.elementAt(1);
        lis.indexOf(4);//3
        System.out.println(lis.contains(3));
        System.out.println(lis.search(1));
        System.out.println(lis.search(4));
    }
}
 