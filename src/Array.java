public class Array {
    int[] prefixSum(int a[]) {
        int[] psum = new int[a.length];
        psum[0] = a[0];
        for (int i = 1; i < a.length; i++)
            psum[i] = psum[i - 1] + a[i];
        return psum;
    }
    

    void printArray(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
    }
    
}
