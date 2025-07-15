class Solution {
    public int search(int[] nums, int target) {
        int a=peakindex(nums);
        int b=binarysearch(nums,target,0,a);
        if(b!=-1)return b;
        else return binarysearch(nums,target,a+1,nums.length-1);
    }
    public int peakindex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int  mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])return mid;
            if(mid>start && arr[mid]<arr[mid-1])return mid-1;
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }return -1;
    }
    public int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }return -1;
        
    }
}