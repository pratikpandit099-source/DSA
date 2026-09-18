class Solution {
    public int countDigits(int num) {
        int count=0;
        int originalNum = num;
        while(num>0){
            int x=0;
            x= num%10;
            if(originalNum%x==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}