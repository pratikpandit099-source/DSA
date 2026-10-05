class Solution {
    public int scoreOfParentheses(String s) {
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                l++;
            }
            else{
                l--;
                if(s.charAt(i-1) =='('){
                    r+= Math.pow(2,l);
                }
            }
           

        }
         return r;
    }
}