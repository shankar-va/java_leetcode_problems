class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        int i=s.length()-1;
        char[] arr=s.toCharArray();
        
        while(i>=0){
            if(arr[i]==' ')return count;
            count++;
            i--;
        }return 0;
    }
}