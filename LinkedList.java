import java.lang.ProcessHandle.Info;

// this is the implimentation of the linked list. by James Marshall
// ................................................................

// Linked lists are powerful data structures under the right circumstance. For example they are great if you plan to insert and remove elements from the list. (this works great with sorting algorithms)
// This is because we are not using chunks of memory like we do in arrays, we connect the lists with pointers connected to nodes. 
// it is easy to change where the pointer is pointing in order to delete or insert nodes into the list. 
// one downside with using linked lists is that it cannot be indexed, it has to itterate through the entire list until it gets to the node you want.
// that is the strength of the array. 

public class LinkedList<t> {
    // this is our node class that allows us to store the next node aswell as the information on this node. 
    public class node{
        node next = null; 
        t info = null;
    }
    // this is the start of our list, we always start our itterations here
    node head = null;
    node current = head;
    public void Insert(t data){
        System.out.println("Trying to Find Links");
        node temp = new node();
        temp.info = data;
        if( head == null){
            head = temp;
        }
        else{
            current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = temp;
        }
        System.out.println("working");
    }



}
