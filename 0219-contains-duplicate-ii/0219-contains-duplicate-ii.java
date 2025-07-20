class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int left=0;
      
      HashSet <Integer> hash=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if((i-left)>k){
            hash.remove(nums[left]);
            left++;
        }if(hash.contains(nums[i])){
            return true;
        }else hash.add(nums[i]);
      }return false;  
    }
}