
 class start
 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        int sz =st.size;
        for(int i = 0; i < sz; i++)
        {
            System.out.println(st.pop());
        }

    }
}