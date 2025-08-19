class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==0)return mat[0][0];
        int result=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j || (i+j==mat.length-1 && mat.length-1/2!=i)){
                    result+=mat[i][j];
                }
            }
        }return result;
    }
}