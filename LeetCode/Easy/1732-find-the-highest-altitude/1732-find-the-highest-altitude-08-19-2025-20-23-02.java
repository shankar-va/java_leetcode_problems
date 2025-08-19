class Solution {
    public int largestAltitude(int[] gain) {
        int res=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            res+=gain[i];
            max=Math.max(res,max);
        }return max==Integer.MIN_VALUE ||max<=0?0:max;
    }
}