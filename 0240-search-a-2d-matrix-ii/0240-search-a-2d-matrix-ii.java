class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row=0;
        int column=nums[0].length-1;
        while(column>=0 && row <nums.length){
            if(nums[row][column]==target)return true;
            else if(nums[row][column]<target){
                row++;
            }else if(nums[row][column]>target){
                column--;
            }
        }return false;
    }
}