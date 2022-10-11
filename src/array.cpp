#include<bits/stdc++.h>
using namespace std;
int quicksort(int arr[], int st, int end){
    int pivot=arr[end];
    int j=st-1;
    for(int i=st ; i<end ;i++){
        if(arr[i]<pivot){
            j++;
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[j+1],arr[end]);
    return j+1;
}
void quick_sort(int arr[], int st,int end){
    if(st<end){
        int pivot=quicksort(arr,st,end);
        quick_sort(arr,st,pivot-1);
        quick_sort(arr,pivot+1,end);
    }
}
int main(){
    int arr[]={1,2,4,3,-1,5,6,7,9};
    int n=sizeof(arr)/sizeof(arr[0]);
    quick_sort(arr,0,n-1);
    for(auto i:arr ) cout<<i<<" ";
    return 0;
}