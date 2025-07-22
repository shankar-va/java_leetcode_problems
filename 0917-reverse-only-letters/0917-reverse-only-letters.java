class Solution {
    public String reverseOnlyLetters(String s) {
        char[] reversed=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(Character.isLetter(reversed[start]) && Character.isLetter(reversed[end]) ){
                char temp=reversed[start];
                reversed[start]=reversed[end];
                reversed[end]=temp;
                start++;
                end--;
            }else if(!Character.isLetter(reversed[start]) ){
                start++;
            }else if(!Character.isLetter(reversed[end])){
                end--;
            }
        }return new String(reversed);
    }
}