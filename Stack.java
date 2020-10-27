public class Stack<T> {
 // this stack is not the most performance friendly, I will come back after the rest of the data structurs
 // and I will create better ones

    LinkedList<T> container = new LinkedList<T>();

    int size = 0;

    void push(T item)
    {
        container.InsertEnd(item);
        size++;
    }

    T peek()
    {
        return container.Peek(0);
    }

    T pop()
    {
       T item = container.Peek(container.GetSize()-1);
       container.delete(container.GetSize()-1);
       size--;
       return item;
    }
}
