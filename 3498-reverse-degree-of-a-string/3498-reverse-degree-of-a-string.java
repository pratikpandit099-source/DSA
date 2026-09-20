class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                int multiplier = 26 - (ch - 'a');
                int index= i+1;
                sum = sum+(index * multiplier);
            }
        }
        
        return sum;
    }
}