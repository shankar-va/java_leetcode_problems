class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0,j=height.length-1;
        while(i<j){
                int water=((int) Math.min(height[i],height[j]))*( j-i ) ;
                if(height[i]<height[j])i++;
                else j--;
                if(water>=max)max=water;
            
        }return max;
    }
}