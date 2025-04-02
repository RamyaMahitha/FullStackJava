import java.util.*; 
public class listiterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        // for backward accessing
        ListIterator<String> listIte = list.listIterator(list.size());

        while (listIte.hasPrevious()) {
            System.out.println(listIte.previous());
        }
        // for forward accessing
        ListIterator<String> listIt = list.listIterator();

        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }
    }
}

    

