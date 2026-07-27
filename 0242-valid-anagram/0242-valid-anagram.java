class Solution {
    public boolean isAnagram(String s, String t) {
        char[] A = s.toCharArray();
        char[] B = t.toCharArray();
        
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A,B);
        
    }
}