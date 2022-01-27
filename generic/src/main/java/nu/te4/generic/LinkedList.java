/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public int removetail(){
        //hitta näst sista med en dowhile lik den i getTail()?
    }
    
    public void print(){
        
    }
}
