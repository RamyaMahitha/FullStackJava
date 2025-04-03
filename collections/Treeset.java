import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        SortedSet<Integer> st=new TreeSet<>();
        st.add(10);
        st.add(15);
        st.add(25);
        st.add(19);
        st.add(10);
        System.out.println(st);
        st.remove(10);
        System.out.println(st.size());
      System.out.println(st.first());
      System.out.println(st.last());
    System.out.println(st);  
  }
    
}
