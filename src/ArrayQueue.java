public class ArrayQueue {
    int[] arr;
    int capacity, front, rear;


    ArrayQueue(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = 0;
        rear = 0;
    }

    public void enqueue(int d) {
        if (rear == capacity) {
            System.out.println("queue is full");
            return;
        }
        arr[rear++] = d;
    }

    public int dequeue() {
        if (front == rear) {
            front = rear = 0;
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front++];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public int size() {
        return rear - front + 1;
    }

}
