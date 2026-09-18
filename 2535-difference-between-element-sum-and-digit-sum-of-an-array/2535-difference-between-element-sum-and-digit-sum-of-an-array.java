class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum =0;
        int digitSum =0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            
            elementSum+=nums[i];
            while(nums[i]>0){
                int x=0;
                x=nums[i]%10;
                digitSum+=x;
                nums[i]/=10;

            }

        }
        result = elementSum - digitSum;
        if(result<0){
            result*=-1;
        }
        return result;
    }
}