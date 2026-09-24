class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum =0;
        int rightSum =0;
        int maxSum =0;
        int n = cardPoints.length;

        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
            maxSum = leftSum;
        }
        int rightIndex = n-1;

        for(int i=k-1;i>=0;i--){
            leftSum -=cardPoints[i];
            rightSum +=cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, rightSum+leftSum);
        }
        return maxSum;
    }
}