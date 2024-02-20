
import java.util.*;

public class BuiltinLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());

        // list.remove()//for removing the element at index
        list.removeFirst();
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "-> ");
        }
    }
}
