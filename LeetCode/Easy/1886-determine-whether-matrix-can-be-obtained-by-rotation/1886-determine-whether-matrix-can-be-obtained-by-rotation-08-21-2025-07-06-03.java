class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(Arrays.deepEquals(mat,target))return true;
        return degreerotation(mat,target,1);
    }
    public boolean degreerotation(int [][] mat,int [][] target,int n){
        if(n==4 && !Arrays.deepEquals(mat,target))return false;
        int [][] arr=new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                arr[i][j]=mat[j][i];
            }
        } reversearray(arr);
        if(Arrays.deepEquals(arr,target))return true;
        return degreerotation(arr,target,n+1);
        
    }
    public int[][] reversearray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            int a=0,b=arr[i].length-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }return arr;
    }
}