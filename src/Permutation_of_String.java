/*A permutation also called an “arrangement number” or “order,” is a rearrangement of the elements
of an ordered list S into a one-to-one correspondence with S itself. A string of length n has n! permutation.
Below are the permutations of string ABC.
ABC ACB BAC BCA CBA CAB*/
public class Permutation_of_String {
//    Solution using backtracking
//    Time Complexity O(n*n!)
//    here l is the starting index
//    here r is the end index
    void permute(String s,int l,int r){
        if(l==r){
            System.out.println(s);
            return;
        }
        for (int i = l; i <=r ; i++) {
            s=swap(s,l,i);
            permute(s,l+1,r);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }
    }
    String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
