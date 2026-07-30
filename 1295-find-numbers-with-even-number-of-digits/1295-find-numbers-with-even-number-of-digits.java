class Solution {

    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    static int digits(int num) {

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}