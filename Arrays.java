
 class start
 {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        for(int i = 0; i < 5; i ++)
        {
            System.out.println(q.deQueue());
        }
    }
}