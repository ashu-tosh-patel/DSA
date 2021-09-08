public class ArrayList {
    int[] arr;
    int capacity;
    int size;

    ArrayList() {
        capacity = 10;
        size = 0;
        arr = new int[capacity];
    }

    void add(int data) {
        if (size > capacity / 2) resize();
        arr[size++] = data;
    }

    void remove(int i) {
        for (int j = i; j < size; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
    }

    int size() {
        return size ;
    }

    private void resize() {
        int[] temp = new int[capacity * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        capacity *= 2;
        arr = temp;
    }

}
