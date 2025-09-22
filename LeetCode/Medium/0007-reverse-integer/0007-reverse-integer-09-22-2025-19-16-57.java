class Solution {
    public int reverse(int x) {
        String s=Integer.toString(x);
        int sign=1;
        char [] ch;
        if(s.charAt(0)=='-'){
            sign=-1;
         ch=new char[s.length()-1];
        s=s.substring(1);
        }else {
             ch=new char[s.length()];
        }
        
       for(int i=0;i<s.length();i++){
        ch[i]=s.charAt(i);
        
       }
        
       
       
        
        reverse(ch);
        StringBuilder sb=new StringBuilder();
        for(char z:ch){
            sb.append(z);
        }
        String res=sb.toString();
        long result=Long.parseLong(res)* sign;
        return (result>=Integer.MIN_VALUE &&result<=Integer.MAX_VALUE )? (int) result:0; 
    }
    public static void reverse(char[] ch){
        int i=0,j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
}