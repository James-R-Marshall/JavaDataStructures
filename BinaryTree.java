// this is a binary tree, it is a good medium between the linked list and arry
// it allows us to get faster inserting than arrays and faster searching than linked lists



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
}