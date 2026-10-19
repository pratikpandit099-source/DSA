class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                arr.add(i);

            }
        }
        return arr;
    }
    public static int[]sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }
        return nums;
    }
}