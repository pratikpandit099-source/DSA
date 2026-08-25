class Solution {
    public int missingMultiple(int[] nums, int k) {
        int original =k;

        while (true) {

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == k) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return k;
            }

            k = k + original;
        }
    }
}