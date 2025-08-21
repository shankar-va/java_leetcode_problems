class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet <Integer> hash=new HashSet<>();
        for( int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        int a=0;
        for(int num:hash){
            nums[a]=num;
            a++;
        }Arrays.sort(nums,0,a);
        return hash.size();
    }
}