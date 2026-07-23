class Solution {
    public int maximumWealth(int[][] accounts) {
        
        // person = Row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum = rowsum + accounts[person][account];

                
            }  // when we come out of this row 
               // we have to cheak for max rowsum
               if(rowsum>ans){
                ans = rowsum;
               }
               

            
        }
        return ans;
        
        
    }
}