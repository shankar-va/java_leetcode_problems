class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        if(n%4!=0)return false;
        int i=1,j=n/4;
        while(i<=j){
            int mid=i+(j-i)/2;
            int res=(int)Math.pow(4,mid);
            if(res==n)return true;
            else if(res>n)j=mid-1;
            else i=mid+1;
        }return false;
    }
}