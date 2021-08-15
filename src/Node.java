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

    public Node() {

    }
}