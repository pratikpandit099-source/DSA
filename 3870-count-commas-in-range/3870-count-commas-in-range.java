class Solution {
    public int countCommas(int n) {
        int totalComma = 0;
        long number = 1000;
        while(n>=number){
            totalComma +=(n-number+1);
            number *=1000;
        }
        return totalComma;
    }
}