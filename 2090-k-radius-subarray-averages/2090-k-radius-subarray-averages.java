// class Solution {
//     public int[] getAverages(int[] nums, int k) {
//         int [] ans = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             if(i < k || i + k >= nums.length){
//                 ans[i]= -1;
//             }
//             if(i >= k && i + k < nums.length){
//                 int sum =0;
                
//                 sum+=nums[i];
//                 for(int j=1;j<=k;j++){
//                     sum += nums[i-j]+nums[i+j];
//                 }
//                 long avg = sum/(2*k+1);
//                 ans[i]=(int) avg;

//             }


//         }
//         return ans;
//     }
// }

class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        if (k == 0) {
            return nums;
        }

        int windowSize = 2 * k + 1;

        if (windowSize > n) {
            return ans;
        }

        long sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }
        ans[k] = (int)(sum / windowSize);
        for (int i = k + 1; i < n - k; i++) {
            sum -= nums[i - k - 1];
            sum += nums[i + k];

            ans[i] = (int)(sum / windowSize);
        }

        return ans;
    }
}