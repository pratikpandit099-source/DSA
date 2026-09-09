class Solution {
    public long countCommas(long n) {
       long totalCommas = 0;
       long number = 1000;
       while(n>=number){
        totalCommas+=(n-number+1);
        number *=1000;
       }
       return totalCommas;
    }
}