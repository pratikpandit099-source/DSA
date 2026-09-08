class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;
        int count1=0;
        int count2=0;
        while(i<moves.length()){
            char ch = moves.charAt(i);
            if(ch=='L'){
                count1++;
            }else if(ch =='R'){
                count1--;
            }else if(ch =='U'){
                count2++;
            }else{
                count2--;
            }
            i++;
        }
       return count1 == 0 && count2 == 0;
    }
}