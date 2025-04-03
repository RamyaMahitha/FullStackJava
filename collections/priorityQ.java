import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class priorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> dq=new PriorityQueue<>();
        dq.add(1);
        dq.add(23);
        dq.add(6);
        dq.add(3);
        dq.add(20);
        dq.add(10);
        System.out.println(dq);
       //dq.offer(10); //offer or add both are same
       dq.peek();
       dq.poll();
       System.out.println(dq);


        
    }
    
}
