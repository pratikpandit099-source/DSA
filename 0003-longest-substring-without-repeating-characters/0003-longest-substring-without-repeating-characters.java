class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ans = new HashSet<>();
        int left =0;
        int max = 0;
        int l=0;
        if(s.length() == 1) return 1;
        for(int right=0;right<s.length();right++){
            while(ans.contains(s.charAt(right))){
                ans.remove(s.charAt(left));
                left++;
            }
            l = right-left+1;
            ans.add(s.charAt(right));
            max = Math.max(max,l);
            
        }
        return max;
    }
}