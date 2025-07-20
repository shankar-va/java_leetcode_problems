class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int minimum=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid+1<nums.length && nums[mid]>nums[mid+1])return nums[mid+1];
            else if( mid-1>0 && nums[mid]<nums[mid-1])return nums[mid];
            if(nums[start]<nums[end])return nums[start];
            else if(nums[start]==nums[end]){
                minimum=Math.min(nums[mid],minimum);
                start=mid;
            }else{
                end=mid-1;
            }
        }return minimum;
    }
}