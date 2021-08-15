public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        for (int i = 1; i < 10; i++) {
            linkedList.insertAtEnd(i*5);
        }

        linkedList.printLinkedList();

//        linkedList.insertAtStart(0);
//
//        System.out.println("changed Linked List:");
//        linkedList.printLinkedList();

        linkedList.insertAtPosition(4,8);

        System.out.println("changed linked list ;");
        linkedList.printLinkedList();



    }
}
