class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=First_occurence( nums, target);
        int last=Last_occurence( nums, target);
        return new int[]{first,last};
    }
    public int First_occurence(int [] arr,int target){
        int result=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return result;
    }
     public int Last_occurence(int [] arr,int target){
        int result=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end -start)/2;
            if(arr[mid]==target){
                result=mid;
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return result;
    }
}