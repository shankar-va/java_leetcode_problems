class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
    for(int i=0;i<s.length();i++){
        StringBuilder substring=new StringBuilder();
        for(int j=i;j<s.length();j++){
            char current=s.charAt(j);
            if(substring.indexOf(String.valueOf(current))!=-1){
                break;
            }else{
                substring.append(current);
                max=Math.max(max,substring.length());
            }
        }
    }return max;
    }
}