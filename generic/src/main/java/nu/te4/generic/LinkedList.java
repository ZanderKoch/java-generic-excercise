package nu.te4.generic;

/**
 *
 * @author Zander Koch
 */
public class LinkedList{
    Node head;
    
    public Node getTail(){
        Node current = head;
        while(current.next != null){
                current = current.next;
            }
        return current;
    }
    
    public void addToTail(int value){
        getTail().next = new Node(value);
    }
    
    public void removeTail(){
        Node current = head;
        Node previous = head;
        while(current.next != null){
            previous = current;    
            current = current.next;     
        }
        previous.next = null;
    }
    
    public void print(){
        Node current = head;
        while(current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
