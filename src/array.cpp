//binary_search with recursion
#include<bits/stdc++.h>
using namespace std;
int find(int arr[], int st,int end, int x){
    if(st>end) return -1;
    int mid=(st+end)/2;
    if(arr[mid]==x) return mid+1;
    else if(arr[mid]>x){
        return find(arr,st,mid-1,x);
    }
    return find(arr,mid+1,end,x);
}
int main(){
    int arr[]={1,2,8,9,10,14,19};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<find(arr,0,n-1,10);
}