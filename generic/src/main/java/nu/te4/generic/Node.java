package nu.te4.generic;

/**
 *
 * @author Zander Koch
 */
public class Node<T>{
    Node next;
    T value;

    public Node(T value){
        this.value = value;
    }

    public Node(Node next, T value){
        this.next = next;
        this.value = value;
    }
}
