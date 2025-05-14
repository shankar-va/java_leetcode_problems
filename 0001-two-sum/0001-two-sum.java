class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int a=i;
            while((a+1)<nums.length){
                if(nums[i]+nums[a+1]==target){
                    arr[0]=i;
                    arr[1]=a+1;
                    return arr;
                }
                a++;
            }
        }
        return arr;
    }
}