class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Set<Integer> ans = new HashSet();
       for(int i=0;i<nums.length;i++){
        if(ans.contains(nums[i])){
            return true;
        }
        ans.add(nums[i]);
        if(ans.size()>k){
            ans.remove(nums[i-k]);
        }
       }
       return false;
    }
}