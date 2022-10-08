public class HeapProblems {
    //problem 7: find max element in min Heap;
    public int findMaxInMinHeap(Heap h) {
        int max = -1;
        for (int i = (h.count + 1) / 2; i < h.count; i++) {
            if (h.array[i] > max)
                max = h.array[i];
        }
        return max;
    }
    
    
    //problem 12: merge 2 binary heaps
    public void merge(Heap h1, Heap h2) {
        while (h2.count != 0) {
            h1.insert(h2.getMaximum());
        }
    }

    //problem 9: find max element in min Heap;
    public int Delete(Heap h, int i) {
        int key;
        if (h.count < i) return -1;
        key = h.array[i];
        h.array[i] = h.array[h.count - 1];
        h.count--;
        h.percolateDown(i);
        return key;
    }
    
    //problem 15: find kth largest element
    public int findkth(Heap h, int k) {
        for (int i = 0; i < k - 1; i++) {
            h.deleteMax();
        }
        return h.deleteMax();
    }

    //problem 11: print all elements less than val
    public void lessThan(Heap h, int val) {
        if (h.getMaximum() < val) {
            System.out.println(h.deleteMax());
            lessThan(h, val);
        }
    }


    //problem 13: merge 2 binary heaps without heapify (using Build heap)
    public void mergeTwo(Heap h1, Heap h2) {
        for (int i = 0; i < h2.count; i++) {
            h1.array[h1.count++] = h2.array[i];
        }
        for (int i = (h1.count + 1) / 2; i >= 0; i--) {
            h1.percolateDown(i);
        }
    }

    


}
