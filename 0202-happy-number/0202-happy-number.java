class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast =n;
        do{
            slow = Number(slow);
            fast = Number(Number(fast));
        }while(slow!=fast);
        
        return (slow ==1);
                                                                                    
    }
    static int Number(int n){
    int m=0;
    while(n>0){
        int digit = n%10;
        m+=digit*digit;
        n/=10;
        
      }
      return m;  
    }
}