public class LinkedList <Type> {
    Node<Type> head;
    int size;

    LinkedList() {
        size = 0;
    }

    LinkedList(Type d) {
        head = new Node<Type>(d);
        size = 1;
    }

    void deleteAtEnd() {
        if (head == null) {
            return;
        } else {
            Node<Type> i = head;
            while (i.next.next != null)
                i = i.next;
            i.next = null;
        }
        size--;
    }


    void insertAtEnd(Type d) {
        if (head == null) {
            head = new Node<Type>(d);
        } else {
            Node<Type> i = head;
            while (i.next != null)
                i = i.next;
            i.next = new Node<Type>(d);
        }
        size++;

    }


    void insertAtStart(Type d) {
        Node<Type> temp = new Node<Type>(d);
        temp.next = head;
        head = temp;
        size++;
    }

    void deleteAtStart() {
        head = head.next;
        size--;
    }

    void deleteAt(int pos) {
        Node<Type> temp = head;
        int count = 1;
        while (count != pos - 1) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    void insertAt(int pos, Type d) {
        Node<Type> temp = head;
        int count = 1;
        while (count != pos - 1) {
            count++;
            temp = temp.next;

        }
        temp.next = new Node<Type>(d, temp.next);
        size++;
    }

    int search(Type val) {
        int pos = 0;
        Node<Type> temp = head;
        while (temp != null) {
            if (temp.data.equals( val)) return pos;
            pos++;
            temp = temp.next;
        }
        return -1;
    }

    Type get(int pos){
        Node<Type> temp = head;
        while (temp.next != null) {
            if (pos == 0) return temp.data;
            pos--;
            temp = temp.next;
        }
        return null;
    }

    int size(){
        return size;
    }


    void printLinkedList() {
        for (Node<Type> i = head; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }
}


