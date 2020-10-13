
 class quickstart
 {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.print("hi\n");

        LinkedList ll = new LinkedList<String>();
        ll.Insert("Hello");
        ll.Insert("James");
        ll.Insert("My");
        ll.Insert("Name");
        ll.Insert("Sarah");
        ll.Insert("!");
        ll.PrintList();
        System.out.println("\n");
        System.out.println(ll.Peek(4));
        ll.delete(4);
        System.out.println("\n");
        ll.PrintList();
        System.out.println("\n");
        ll.insertAt(4, "Philip");
        ll.PrintList();


    }
}