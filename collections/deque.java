import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.offer(1);
        dq.offerFirst(12);
        dq.offerLast(11);
        System.out.println(dq);
        dq.pollFirst();
        dq.pollLast();
        dq.peekFirst();
        dq.peekLast();
        System.out.println(dq);
        

    }
    
}
