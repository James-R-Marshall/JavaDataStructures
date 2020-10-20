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
        int index = 0;
    }
    // this is the start of our list, we always start our itterations here
    node head = null;
    node current = head;
    int Size = 0;


    private void resetIndex()
    {
        node holder = head;
        for(int i = 0; i < Size;i++)
        {
            holder.index = i;
            holder = holder.next;
        }
    }
    public void InsertBeginning(t data){
        node temp = new node();
        temp.index = 0;
        Size++;
        temp.info = data;
        node holder = head;
        head = temp;
        head.next = holder;
        holder = head;
        resetIndex();
    }
    public void InsertEnd(t data){
        node temp = new node();
        temp.index = Size;
        Size++;
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
    }

    public void PrintList()
    {
        node current = head;
        while (current!= null)
        {
            System.out.println(current.info);
            current = current.next;
        }
    }

    public t Peek(int index)
    {
        node current = head;
        if(index >= Size || Size == 0)
        {
            return null;
        }
        else
        {
            for(int x = 0; x < index; x++ )
            {
                current = current.next;
            }
            return current.info;
        }
    }

    public void delete(int index)
    {
        node current = head;
        node trailing = current;
        if(index >= Size || Size == 0)
        {
            System.out.println("\nCannot delete index value out of range or list empty\n");
        }
        else
        {
            for(int x = 0; x < index; x++ )
            {
                trailing = current;
                current = current.next;
            }

            trailing.next = current.next;
            Size--;
            resetIndex();

        }
    }

    public void insertAt(int index, t data)
    {
        node temp = new node();
        temp.info = data;
        temp.index = Size;
        node current = head;
        Size++;
        node trailing = current;
        if(index >= Size || Size == 0)
        {
            head = temp;
        }
        else
        {
            for(int x = 0; x < index; x++ )
            {
                trailing = current;
                current = current.next;
            }

            trailing.next = temp;
            temp.next = current;

            resetIndex();

        }
        
    }
    public int GetSize()
    {
        return Size;
    }

}
