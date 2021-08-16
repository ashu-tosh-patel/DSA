

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.insertAtEnd(i * 5);
            if (i % 2 == 0) list.insertAtEnd(i * 5);
        }

        list.printLinkedList();
        LinkedListProblems.removeDuplicates(list);
        list.printLinkedList();

    }
}
