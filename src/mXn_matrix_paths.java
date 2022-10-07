public class mXn_matrix_paths {
        /*Problem Statement- to count all the possible paths from top left to bottom right of a mXn matrix
        with the constraints that from each cell you can either move only to right or down*/
        static int count(int n,int m){
            if(n==1||m==1)return 1;
            return count(n-1,m)+count(n,m-1);
        }
}
