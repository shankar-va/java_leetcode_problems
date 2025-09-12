class Solution {
    public int maxProfit(int[] arr) {
        int i=0,j=1;
        int profit=0;
        while(i<=j && j<arr.length){
            if(arr[i]<=arr[j]){
                profit=Math.max(profit,arr[j]-arr[i]);
                j++;
            }else{
                
                i++;
            }

        }return profit;
    }
}