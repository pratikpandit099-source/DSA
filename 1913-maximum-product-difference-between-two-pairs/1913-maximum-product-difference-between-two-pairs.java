class Solution {
    public int maxProductDifference(int[] nums) {
        int n= nums.length;
       for(int i=0;i<n;i++){
        for(int j=1;j<n-i;j++){
            if(nums[j]<nums[j-1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
       }
       int maxProduct = nums[n-1]*nums[n-2];
       int minProduct = nums[0]*nums[1];
       return maxProduct-minProduct; 
    }
}