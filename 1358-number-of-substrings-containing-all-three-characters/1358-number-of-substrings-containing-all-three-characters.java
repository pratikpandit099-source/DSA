class Solution {
    public int numberOfSubstrings(String s) {
        int count =0;
        int lastSeen []={-1,-1,-1};
        for(int i=0;i<s.length();i++){       
            lastSeen[s.charAt(i)-'a']=i;
            if(lastSeen[0]!= -1 &&lastSeen[1]!= -1 &&lastSeen[2]!= -1 ){
                count = count+ (1+ Math.min(lastSeen[0],
                                   Math.min(lastSeen[1],lastSeen[2])));
            }
        }
        return count;
    }
}
// class Solution {
//     public int numberOfSubstrings(String s) {
//         int count =0;
//         for(int i=0;i<s.length();i++){
//             int ans[] = {0,0,0};
//             for(int j=i;j<s.length();j++){   
//             ans[s.charAt(j)-'a'] = 1;
//             if(ans[0]+ans[1]+ans[2] == 3){
//                 count++;
//             }
//             }
//         }
//         return count;

//     }

    
// }