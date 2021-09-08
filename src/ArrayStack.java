public class ArrayStack<T extends Object> {
    int cap, size;
    T[] arr;

    public ArrayStack(int cap) {
        this.cap = cap;
        size = 0;
        arr = (T[]) new Object[cap];
    }

    void push(T d) {
        if (size == cap) {
            System.out.println("Stack Overflow");
        } else {
            arr[size++] = d;
        }
    }

    T pop() {
        if (size == 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[--size];
    }

    T peek() {
        if (size == 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[size - 1];
    }

    int size() {
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

}
