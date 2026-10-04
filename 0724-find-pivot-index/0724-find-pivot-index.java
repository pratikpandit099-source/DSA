// class Solution {
//     public int pivotIndex(int[] nums) {
//         int leftSum =0;
//         for(int i=0;i<nums.length;i++){
//             int rightSum =0;
//             for(int j=nums.length-1;j>i;j--){
//                 rightSum += nums[j];

//             }
//             if(leftSum == rightSum){
//                 return i;
//             }
//             leftSum += nums[i];
//         }
//         return -1;
//     }
// }
class Solution {
    public int pivotIndex(int[] nums) {
      int sum =0;
      for(int i:nums){
        sum+=i;
      }
      int leftSum =0;
      for(int i=0;i<nums.length;i++){
        int rightSum = sum - leftSum - nums[i];
        if(leftSum == rightSum) return i;

        leftSum +=nums[i];

      }
      return -1;
    }
}