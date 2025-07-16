class Solution {
    public boolean search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return true;
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                end--;
                start++;
                continue;
            }else if(arr[start]<=arr[mid]){
                if(arr[start]<=target &&arr[mid]>=target){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }else {
                    if(arr[mid]<=target && target<=arr[end]){
                        start=mid+1;
                    }else{
                        end=mid-1;    
                    }
            }
        }return false;
    }
}