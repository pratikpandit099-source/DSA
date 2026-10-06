class Solution {
    public int minAddToMakeValid(String s) {
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }
            if(s.charAt(i)==')'){
                l--;
            }
            if(l<0){
                l=0;
                r++;
            }

        }
        return l+r;
    }
}