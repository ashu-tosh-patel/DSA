class Node<Type> {
    public Type data;
    public Node next;

    Node(Type d) {
        data = d;
    }

    Node(Type d, Node n) {
        data = d;
        next = n;
    }
// inserting node
    public void push(int val)
{
    Node temp = new Node(val);
    temp.next = head;
    head = temp;
}
}