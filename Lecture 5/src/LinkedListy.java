import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListy {
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<Integer>();
   
        List.add(5);
        List.add(10);
        List.add(59);

        if ( List.isEmpty()) {
            System.out.println("GOTCHA!");
        }
    
        
        System.out.println(List.get(1));

        Iterator it = List.iterator();
        while(it.hasNext()) {
            if((int) it.next() == 59) {
                System.out.println("Iteratred");

            }
        }

    }
}
