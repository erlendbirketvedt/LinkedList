/**
 * Created by erlend on 08.03.17.
 */
public class LinkedList {

    Node first;
    int size;

    LinkedList() {
        first = null;
        size = 0;
    }

    public void add(String s) {
        Node newNode = new Node(s);
        if (first == null)
            first = newNode;
        else {
                for (Node n = first; n != null; n = n.next) {
                    if (n.next == null) {
                        n.next = newNode;
                        break;
                    }
            }
        }
        size++;
        System.out.println("Added node with content \"" + s +"\" to the list");
    }

    public void delete(String s) {
        if (s.equalsIgnoreCase(first.getContent())) {
            first = first.next;
        } else {
            Node prev = first;
            for (Node n = first.next; n != null; n = n.next) {
                if (s.equalsIgnoreCase(n.getContent())) {
                    prev.next = n.next;
                    break;
                }
                prev = prev.next;
            }
        }
        size--;
        System.out.println("Deleted node with content \"" + s + "\" from the list");
    }

    /**
     * Prints the list with arrows to show connections
     */
    public void printList() {
        for (Node n = first; n !=null; n = n.next)
    }

    public int size() {
        return size;
    }

}
