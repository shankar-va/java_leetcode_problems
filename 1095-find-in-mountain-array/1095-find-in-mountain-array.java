/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int a=peakindex(mountainArr);
        int b=BS(mountainArr,0,a,target);
        if(b!=-1)return b;
        else return BS(mountainArr,a+1,mountainArr.length()-1,target);
    }
    public int peakindex( MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end =mid;

            }else {
                start=mid+1;
            }
        }return start;
    }
    public int BS( MountainArray mountainArr,int start,int end, int target){
        if(mountainArr.get(start)<mountainArr.get(end)){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target)return mid;
            else if(mountainArr.get(mid)<target){
                start=mid+1;
            }else if(mountainArr.get(mid)>target){
                end=mid-1;
            }
            
        }return -1;
        }else{while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target)return mid;
            else if(mountainArr.get(mid)>target){
                start=mid+1;
            }else if(mountainArr.get(mid)<target){
                end=mid-1;
            }
            
        }return -1;

        }
    }
}