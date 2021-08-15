class Node {
    public int data;
    public Node next;

    Node(int d) {
        data = d;
    }

    Node(int d, Node n) {
        data = d;
        next = n;
    }

    public Node() {

    }
}