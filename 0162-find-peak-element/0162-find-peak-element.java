class Solution {
    public int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1] ){
                start=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }return start;
    }
}