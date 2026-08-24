class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> result = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     boolean found = false;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(i!=j){
        //             if(nums[i]==nums[j]){
        //                 result.add(nums[i]);
        //                 break;
        //             }
        //         }

        //     }
        // }
        // return result;
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                result.add(nums[i]);
            }
        }
        return result;
    }
}