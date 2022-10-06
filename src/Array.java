public class Array {
    int[] prefixSum(int a[]){
        int ps[] = new int[a.length];
        ps[0] = a[0];
        for(int i =1; i<a.length; i++){
            ps[i] = a[i]+ps[i-1];
        }
        return ps;
    }
}
