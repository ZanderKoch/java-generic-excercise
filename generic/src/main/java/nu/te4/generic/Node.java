package nu.te4.generic;

/**
 *
 * @author Zander Koch
 */
public class Node{
    Node next;
    int value;

    public Node(int value){
        this.value = value;
    }

    public Node(Node next, int value){
        this.next = next;
        this.value = value;
    }
}
