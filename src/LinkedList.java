public class LinkedList {
    Node head;

    LinkedList() {
    }

    LinkedList(int d) {

        head = new Node(d);
    }

    void insertAtEnd(int d) {
        if (head == null) {
            head = new Node(d);
        } else {
            Node i = head;
            while (i.next != null)
                i = i.next;
            i.next = new Node(d);
        }

    }

    void insertAtStart(int d) {
        Node temp = new Node(d);
        temp.next = head;
        head = temp;
    }

    void insertAtPosition(int pos, int d){
        Node temp = head;
        int count=1;
        while(count!=pos-1){
            count++;
            temp= temp.next;

        }
        temp.next = new Node(d,temp.next);
    }

    void printHead(){
        System.out.println(head.data);
    }

    void printLinkedList() {
        for (Node i = head; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }
}


