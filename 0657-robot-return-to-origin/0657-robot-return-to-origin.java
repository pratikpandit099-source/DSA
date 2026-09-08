class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        while(i<moves.length()){
            char ch = moves.charAt(i);
            if(ch=='L'){
                count1++;
            }else if(ch =='R'){
                count2++;
            }else if(ch =='U'){
                count3++;
            }else{
                count4++;
            }
            i++;
        }
        if(count1 == count2 && count3 == count4){
            return true;
        }
        return false;
    }
}