import java.util.*;
public class treemap {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>();
        map.put(101,"Raju"); ///in 101 raju stores
        map.put(102,"Rahul");
        map.put(101,"Ravi"); //later after this ravi will point to 101
        map.put(100,"Hari");
        // we are using tree map so the keys are arranged in order
        System.out.println(map);
        map.put(102,"Tillu");
        System.out.println(map.get(102));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet()); //gives the keys with values
    }
    
}
