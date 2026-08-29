class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length;
        int i=0;
        do{
             
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target){
                return i;
            }else if(target>nums[end-1]){
                return end;
            }
            i++;

        }
        while(start<end);
        return -1;
    }
}