import javax.lang.model.util.ElementScanner6;

// this is a binary tree, it is a good medium between the linked list and arry
// it allows us to get faster inserting than arrays and faster searching than linked lists
// this one is a sorted tree, it will add nodes on the tree according to the value. 


class BinaryTree <t>
{
    class node
    {
        t data;
        int value;
        node left = null;
        node right = null;
        public node(t item)
        {
            data = item;
            left = right = null;
        }
    }
    node head = null;
    int numNodes = 0;

    void insert(t data,int value)
    {
        if(head == null)
        {
            head = new node(data);
            head.value = value;
            numNodes++;
        }
        else
        {
            node current = head;
            boolean added = false;
            while(!added)
            {
                if (value <= current.value)
                {
                    if(current.left == null)
                    {
                        current.left = new node(data);
                        current.left.value = value;
                        numNodes++;
                        added = true;
                    }
                    else
                    {
                        current = current.left;
                    }
                }
                else 
                {
                    if(current.right == null)
                    {
                        current.right = new node(data);
                        current.right.value = value;
                        numNodes++;
                        added = true;
                    }
                    else
                    {
                        current = current.right;
                    }
                }
                
            }
        }
    }

    // returns the value of the object (this can be useful for objects without a numerical value..)
    // since it will give you a value to reference for other functions. 
    int SearchBData(t item)
    {
        node current = head;
            if(current == null)
            {
                return -1;
            }
            else if(item == current.data)
            {
                return current.value;
            }
            else
            {
                return transverse(head, item);
            }

    }

    // this one uses the sorted functionality of the tree to make it a much faster transversal. it is logO
    t orderedTransverse(int value)
    {
        node current = head;
        while (true)
        {
            
            if(current == null)
            {
                return null;
            }
            else if(current.value == value )
            {
                return current.data;
            }
            else if(value <= current.value)
            {
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
    }


    int transverse(node current, t item)
    {
        int num = 0;
        if(current == null)
        {
            return 0;
        }

        else if(item == current.data)
            {
                return current.value;
            }
        else
        {
            
            num += transverse(current.left, item);
            num += transverse(current.right, item);
            return num;
        }
    }


}