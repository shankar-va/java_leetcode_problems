class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
            k=k%nums.length;
        
        nums=reversearray(nums,0,n-1);
        nums=reversearray(nums,0,k-1);
        nums=reversearray(nums,k,n-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public int[] reversearray(int[] arr,int Left,int Right){
        int left=Left;
        int right=Right;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }return arr;
    }
}