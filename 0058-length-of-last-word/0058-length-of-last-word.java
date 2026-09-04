class Solution {
    public int lengthOfLastWord(String s) {
        //remove all spaces
        s = s.trim();
        int lastSpace = s.lastIndexOf(' ');
        return s.length() - lastSpace - 1;
    }
}