public class Queue<t> {
   private int Size = 0;
    LinkedList<t> LL = new LinkedList<t>();

    void enQueue(t item)
    {
        LL.InsertBeginning(item);
        Size++;
    }

    t deQueue()
    {
        if(Size == 0)
        {
            return null;
        }
        var item = LL.Peek(Size-1);
        LL.delete(Size - 1);
        Size--;

        return item;
    }
    int getSize()
    {
        return Size;
    }

}
