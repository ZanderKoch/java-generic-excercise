package nu.te4.generic;

import java.util.Scanner;

/**
 *
 * @author Zander Koch
 */
public class Driver{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        
        System.out.println("enter a list of numbers separated by spaces to "
                + "create a linkedlist and start the rest of the program");
        
        Scanner scanner = new Scanner(System.in);
        String[] scannedNumberStrings = scanner.nextLine().split(" ");
        for(String number : scannedNumberStrings){
            list.addToTail(Integer.parseInt(number));
        }
        
        System.out.println("created list");
        list.print();

        boolean done = false;
        while(!done){
            System.out.println("\ravailable commands:"
                + "tail+ <value> | tail- | quit");
            
            String[] command = scanner.nextLine().split(" ");
            switch(command[0]){
                case("tail+"):
                    list.addToTail(Integer.parseInt(command[1]));
                    list.print();
                    break;
                    
                case("tail-"):
                    list.removeTail();
                    list.print();
                    break;
                    
                case("quit"):
                    done = true;
                    break;
            }
        }
        
        
    }
}
