import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //Hash map is similar to tree map but the keys are not in order
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Raju"); ///in 101 raju stores
        map.put(102,"Rahul");
        map.put(101,"Ravi"); //later after this ravi will point to 101
        map.put(100,"Hari");
        map.put(103,"Harinath");
        System.out.println(map); 
        `
    }

    
}
