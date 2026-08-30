// class Solution {
//     public List<Integer> countSmaller(int[] nums) {
//         List<Integer> arr = new ArrayList <>();
//         for(int i=0;i<nums.length;i++){
//             int count = 0;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]<nums[i]){
//                     count++;
//                 }
//             }
//             arr.add(count);

//         }
//         return arr;
//     }
// }

class Solution {
    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        Integer[] ans = new Integer[n];

        List<Integer> sorted = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {

            int pos = binarySearch(sorted, nums[i]);

            ans[i] = pos;

            sorted.add(pos, nums[i]);
        }

        return Arrays.asList(ans);
    }

    private int binarySearch(List<Integer> list, int target) {

        int left = 0;
        int right = list.size();

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}