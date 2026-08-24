class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum =0;
        int product=1;
        while(n>0){
            int r = n%10;
            sum= sum+r;
            product=product*r;
            n=n/10;
        }
        int result= product + sum;
        return original %  result == 0;
        
    }

}