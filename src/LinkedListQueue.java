
public class LinkedListQueue {

    int size;
    Node<Integer> front, rear;

    LinkedListQueue() {
        size = 0;
    }


    public void enqueue(int d) {
        if (size == 0) {
            Node newNode = new Node(d);
            front = newNode;
            rear = newNode;
        } else {
            rear.next = new Node(d);
            rear = rear.next;
        }
        size++;
    }


    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue empty");
            return -1;
        }
        int d = front.data;
        front = front.next;
        size--;
        return d;

    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

}
