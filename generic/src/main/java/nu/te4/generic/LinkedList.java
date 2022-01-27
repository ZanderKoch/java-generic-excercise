package nu.te4.generic;

/**
 *
 * @author Zander Koch
 */
public class LinkedList{
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
    
    public void addToTail(int value){
        if(head == null){
            head = new Node(value);
        }
        else{
          getTail().next = new Node(value);  
        }
        
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
        String result= "";
        Node current = head;
        while(current != null){
            result += Integer.toString(current.value) + ", ";
            current = current.next;
        }
        System.out.println(result);
    }
}
