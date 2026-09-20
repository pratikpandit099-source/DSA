class Solution {
    public int differenceOfSums(int n, int m) {
        int i=1;
        int num1=0;
        int num2=0;
        while(i<=n){
            if(i%m ==0){
                num1+=i;

            }else{
                num2+=i;
            }
            i++;
        }
        return num2-num1;
    }
}