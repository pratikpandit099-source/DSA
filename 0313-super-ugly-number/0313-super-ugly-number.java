
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;

        int[] ugly = new int[n];
        int[] index = new int[k];
        long[] candidates = new long[k];

        ugly[0] = 1;

        for (int j = 0; j < k; j++) {
            candidates[j] = primes[j];
        }

        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                next = Math.min(next, candidates[j]);
            }

            ugly[i] = (int) next;

            for (int j = 0; j < k; j++) {
                if (candidates[j] == next) {
                    index[j]++;
                    candidates[j] =
                        (long) ugly[index[j]] * primes[j];
                }
            }
        }

        return ugly[n - 1];
    }
}
