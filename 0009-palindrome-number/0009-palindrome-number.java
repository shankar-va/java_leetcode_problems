class Solution {
    public boolean isPalindrome(int x) {
        String y=Integer.toString(x);
        int start=0;
        int end=y.length()-1;
        while(start<=end){
            if(y.charAt(start)==y.charAt(end)){
                start++;
                end--;
            }else return false;
        }return true;
    }
}