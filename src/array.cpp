#include<bits/stdc++.h>
using namespace std;
void merge(int arr[], int st, int mid, int end){
    int n1=mid-st+1,n2=end-mid;
    int left[n1],right[n2];
    for(int i=0 ; i<n1 ;i++){
        left[i]=arr[i+st];
    }
    for(int j=0 ; j<n2 ;j++){
        right[j]=arr[j+mid+1];
    }
    int i=0,j=0;
    while(i<n1&&j<n2){
        if(left[i]<right[j]){
            arr[st++]=left[i++];
        }
        else arr[st++]=right[j++];
    }
    while(i<n1) arr[st++]=left[i++];
    while(j<n2) arr[st++]=right[j++];
}
void merge_sort(int arr[], int st, int end){
    if(st<end){
        int mid=(st+end)/2;
        merge_sort(arr,st,mid);
        merge_sort(arr,mid+1,end);
        merge(arr,st,mid,end);
    }
}
int main(){
    int arr[]={6,3,2,1,10,9,8,4};
    int n=sizeof(arr)/sizeof(arr[0]);
    merge_sort(arr,0,n-1);
    for(auto i:arr ) cout<<i<<" ";
    return 0;
}