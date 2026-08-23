class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        int leftQuestions = 0;
        int rightQuestions = 0;

        for (int i = 0; i < n; i++) {
            if (num.charAt(i) == '?') {
                if (i < half) {
                    leftQuestions++;
                } else {
                    rightQuestions++;
                }
            } else {
                if (i < half) {
                    leftSum += num.charAt(i) - '0';
                } else {
                    rightSum += num.charAt(i) - '0';
                }
            }
        }

       
        if ((leftQuestions + rightQuestions) % 2 == 1) {
            return true;
        }

        
        return 2 * (leftSum - rightSum) !=
               9 * (rightQuestions - leftQuestions);
    }
}