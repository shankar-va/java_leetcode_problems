class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len=image.length;
        int arr[][]=new int[len][len];
        for(int i=0;i<len;i++){
            int t=len-1;
            for(int j=0;j<len;j++){
                arr[i][j]=image[i][t];
                if(arr[i][j]==1)arr[i][j]=0;
                else arr[i][j]=1;
                t--;
            }
        }return arr;
    }
}