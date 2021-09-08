public class LinkedListProblems {
    static void  reverseLL(LinkedList ll) {
        Node prev = null, temp = ll.head;
        while (temp != null) {
            Node nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        ll.head = prev;
    }

}
