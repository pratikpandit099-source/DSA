// class Solution {
//     public int strStr(String haystack, String needle) {

//         if (needle.length() > haystack.length()) return -1;
        

//         for (int start = 0; start <= haystack.length() - needle.length(); start++) {

//             int j = 0;

//             while (j < needle.length() &&
//                    haystack.charAt(start + j) == needle.charAt(j)) {
//                 j++;
//             }
//             if (j == needle.length()) {
//                 return start;
//             }
//         }

//         return -1;
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }

        return -1;
        
    }
}