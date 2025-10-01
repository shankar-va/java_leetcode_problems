class Solution {
    public int triangularSum(int[] nums) {
        int i=0;
        int k=nums.length;
        while(!is_array_empty(nums) ){
            
            int j=i+1;
            if(j==k){i=0;j=i+1;k--;
            Arrays.fill(nums,k,nums.length,0);}
            
            nums[i]=(nums[i]+nums[j])%10;
            i++;
        }
        return nums[0];
    }
    public static boolean is_array_empty(int [] arr){
        int left=1,right=arr.length-1;
        while(left<=right){
            if(arr[left]!=0||arr[right]!=0)return false;
            left++;
            right--;
        }return true;
    }
}