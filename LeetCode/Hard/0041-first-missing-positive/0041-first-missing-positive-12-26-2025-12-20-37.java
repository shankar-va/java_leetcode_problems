class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                break;
            }
        }
        if(count==0)return 1;
        for(int i=0;i<n;i++){
            if(arr[i]<1 || arr[i]>n){
                arr[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            int a=Math.abs(arr[i]);
            if(a==n){
                arr[0]=-Math.abs(arr[0]);
            }
            else{
                arr[a]=-Math.abs(arr[a]);
            }
        }
        for(int i=1;i<n;i++){
            if(arr[i]>0)return i;
        
        }
        if(arr[0]>0)return n;
        return n+1;
    }
}