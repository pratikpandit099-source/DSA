class Solution {
    public int digitFrequencyScore(int n) {
     int []ans = new int[10];
     while(n>0){
        ans[n%10]++;
        n/=10;
     }  
     int sum =0; 
     for(int i=0;i<ans.length;i++){
        sum +=( i*ans[i]);

     }
     return sum;
    }
}