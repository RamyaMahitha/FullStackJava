import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.contains(3));
        System.out.println(q.size());
       //System.out.println(q.indexOf(1));
      //  System.out.println(q.clear());
        for(int i:q){
            System.out.println(i+' ');
        }

    }

    
}
