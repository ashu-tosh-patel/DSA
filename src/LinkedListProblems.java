public class LinkedListProblems {
<<<<<<< HEAD
    static void  reverseLL(LinkedList ll) {
=======

    //Iterative Linked List reversal
    static void reverseLL(LinkedList ll) {
>>>>>>> origin/master
        Node prev = null, temp = ll.head;
        while (temp != null) {
            Node nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        ll.head = prev;
    }

<<<<<<< HEAD
=======
    //recursive Linked List reversal
    static void recursiveRevLL(LinkedList ll){
        ll.head = recRevLL(ll.head,null);
    }

    //recursive Linked List reversal helper
    public static Node recRevLL(Node curr, Node prev) {
        if (curr == null) return prev ;

        Node nextNode = curr.next;
        curr.next = prev;
        return recRevLL(nextNode, curr);

    }

    //to remove duplicates from sorted list
    public static void removeDuplicates(LinkedList ll ){
        Node temp = ll.head;
        while (temp.next!=null && temp!=null){
            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }else temp = temp.next;
        }
    }



>>>>>>> origin/master
}
