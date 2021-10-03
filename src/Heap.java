import java.util.Arrays;

public class Heap {
    public int[] array;
    public int count;
    public int capacity;
    public int heap_type;

    public Heap(int capacity, int heap_type) {
        this.capacity = capacity;
        this.heap_type = heap_type;
        this.array = new int[capacity];
        this.count = 0;
    }

    public int parent(int i) {
        if (i <= 0 || i > count) return -1;
        return (i - 1) / 2;
    }

    public int leftChild(int i) {
        int left = i * 2 + 1;
        if (left >= count) return -1;
        return left;
    }

    public int rightChild(int i) {
        int right = 2 * i + 2;
        if (right >= count) return -1;
        return right;
    }

    public int getMaximum() {
        if (count == 0) return -1;
        return array[0];
    }

    public void percolateDown(int i) {
        int lt = leftChild(i), rt = rightChild(i), max = i;
        if (lt != -1 && array[lt] > array[i]) max = lt;
        if (rt != -1 && array[rt] > array[max]) max = rt;
        if (max != i) {
            int temp = array[max];
            array[max] = array[i];
            array[i] = temp;
            percolateDown(max);
        }
    }

    public int deleteMax() {
        if (count == 0) return -1;
        int data = array[0];
        array[0] = array[count - 1];
        count--;
        percolateDown(0);
        return data;
    }

    public void insert(int data) {
        if (count == capacity) resizeHeap();
        count++;
        int i = count - 1;
        while (i >= 0 && data > array[(i - 1) / 2]) {
            array[i] = array[(i - 1) / 2];
            i = (i - 1) / 2;
        }
        array[i] = data;
    }

    private void resizeHeap() {
        int[] newArray = new int[capacity * 2];
        System.arraycopy(array, 0, newArray, 0, count);
        capacity *= 2;
        array = newArray;
    }


}
