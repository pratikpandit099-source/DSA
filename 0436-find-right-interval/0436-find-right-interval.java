import java.util.Arrays;

public class Solution{

    public static int[] findRightInterval(int[][] intervals) {

        int n = intervals.length;
        int[] ans = new int[n];

        
        int[][] starts = new int[n][2];

        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }

        // Sort intervals according to start value
        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {

            int target = intervals[i][1];

            int left = 0;
            int right = n - 1;

            // Find the smallest start >= target
            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (starts[mid][0] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // left is the first valid interval
            if (left < n) {
                ans[i] = starts[left][1];
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}