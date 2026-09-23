class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums,target,0,nums.length-1);
    }
    static int bSearch(int []arr, int target,int s, int e){
        if(s>e) return -1;
        int m = s+(e-s)/2;
        if(arr[m]== target) return m;
        if(arr[m]< target){ 
            return bSearch(arr,target,m+1,e);
        }
        return bSearch(arr,target,s,m-1);
    }
}