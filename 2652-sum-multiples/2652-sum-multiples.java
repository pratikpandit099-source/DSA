class Solution {
    public int sumOfMultiples(int n) {
        int i=1;
        int sum=0;
        while(i<=n){
            if(i%3==0){
                sum=sum+i;
            }else if(i%5==0){
                sum=sum+i;
            }else if(i%7==0){
                sum=sum+i;
            }
            i++;
        }
        return sum;
    }
}