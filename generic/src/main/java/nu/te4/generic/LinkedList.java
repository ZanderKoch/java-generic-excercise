package nu.te4.generic;

/**
 *
 * @author Zander Koch
 */
public class LinkedList<T>{
    Node head;

    public LinkedList(){
    }
    
    
    public Node getTail(){
        Node current = head;
        while(current.next != null){
                current = current.next;
            }
        return current;
    }
    
    public void addToTail(T value){
        if(head == null){
            head = new Node(value);
        }
        else{
          getTail().next = new Node(value);  
        }
        
    }
    
    public void removeTail(){
        if(head.next == null){
            head = null;
        }
        Node current = head;
        Node previous = head;
        while(current.next != null){
            previous = current;    
            current = current.next;     
        }
        previous.next = null;
    }
    
    public void addToHead(T value){
        if(head == null){
            head = new Node(value);
        }
        else{
            head = new Node(head, value);
        }
    }
    
    public void print(){
        String result= "";
        Node current = head;
        while(current != null){
            result += current.value.toString() + ", ";
            current = current.next;
        }
        System.out.println(result);
    }
}
