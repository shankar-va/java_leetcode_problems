class Solution {
    public int myAtoi(String s) {
        
        int res=0;
        s=s.trim();
        if(s.length()==0)return 0;
        int i=0;
        int sign=1;
        if(s.charAt(0)=='-'){
            sign=-1;
            i=1;
        }else if(s.charAt(0)=='+'){
            i=1;
        }

        
        while(i<s.length()){
            char c=s.charAt(i);
            if(c>='0'&& c<='9'){
                int digit=c-'0';
                if(res>((Integer.MAX_VALUE-digit)/10)){
                    return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                res=res*10+digit;
                i++;
            }
            else{
                break;
            }
        }return res*sign;
    }
}