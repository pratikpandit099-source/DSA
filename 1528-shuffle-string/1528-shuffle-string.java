class Solution {
    public String restoreString(String s, int[] indices) {
        char [] result  = new char[s.length()];
        for(int i=0;i<indices.length;i++){
            result[indices[i]] = s.charAt(i);
           

        }
        return new String(result);
    //     int i=0;
    //     while(i<indices.length){
    //         int s= indices[i];
    //         if(s!= i){
    //             swap(indices,indices[s],s)
    //         }else{
    //             i++;
    //         }
    //     }

    // }
    // public int swap(int[]str,int first,int second){
    //     int temp = str[first];
    //     str[first] = str[second];
    //     str[second] = temp;
     }
}