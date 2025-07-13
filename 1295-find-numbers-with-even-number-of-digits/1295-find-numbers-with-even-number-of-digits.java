class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(Even_digit(nums[i])){
                count++;
            }
        }return count;
    }
    public boolean Even_digit(int num){
        if(num==0){
            return false;
        }
        int digit=0;
        while(num>0){
            digit++;
            num=num/10;

        }if(digit%2==0){
            return true;
        }return false;
    }
}