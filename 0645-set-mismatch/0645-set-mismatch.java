import java.util.Arrays;

class Solution {
     public int[] findErrorNums(int[] nums) {
    //     Arrays.sort(nums);

    //     int duplicate = -1;
    //     int missing = -1;
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] == nums[i - 1]) {
    //             duplicate = nums[i];
    //         }
    //         else if (nums[i] > nums[i - 1] + 1) {
    //             missing = nums[i - 1] + 1;
    //         }
    //     }

     
    //     if (nums[nums.length - 1] != nums.length) {
    //         missing = nums.length;
    //     }
    //     if (nums[0] != 1) {
    //         missing = 1;
    //     }

    //     return new int[]{duplicate, missing};
    // }

        int duplicate = -1;
        int missing = -1;
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
       
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j]!= j+1){
              duplicate = nums[j];
              missing= j+1;
            }
        }
        return new int[]{duplicate,missing};
    }

    public  static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}