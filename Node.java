/**
 * Created by erlend on 08.03.17.
 */
public class Node {
    String content;
    public Node next;

    public Node(String s) {
        content = s;
    }

    public String getContent() {
        return content;
    }
}
