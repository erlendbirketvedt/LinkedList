/**
 * Created by erlend on 08.03.17.
 */
public class Program {
    public Program() {
        LinkedList ll = new LinkedList();
        ll.add("Test");
        ll.add("Erlend");
        ll.add("Penis");
        System.out.println(ll.size());
        ll.delete("Penis");
        System.out.println(ll.size());
        ll.add("Shugah");
        System.out.println(ll.size());
    }
}
