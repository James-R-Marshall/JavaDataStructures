
 class start
 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree<Integer>();

        bt.insert(55, 55);
        bt.insert(5, 5);
        bt.insert(30, 30);
        bt.insert(60, 60);
        bt.insert(56,56);
        bt.insert(57,57);
       System.out.println(bt.orderedTransverse(bt.SearchBData(57)));
       bt.delete(56);
       bt.insert(1, 1);
       System.out.println(bt.orderedTransverse(56));
        System.out.println("Printed List");
       bt.printList();

    }
}