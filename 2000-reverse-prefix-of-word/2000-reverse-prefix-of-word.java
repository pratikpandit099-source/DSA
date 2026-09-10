class Solution {
    public String reversePrefix(String word, char ch) {
          char[] characters = word.toCharArray();
       

        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i)== ch){
                int start =0;
                int end = i;
                while(start<end){
                    char temp = characters[end];
                    characters[end]= characters[start];
                    characters[start] = temp;

                    end--;
                    start++;
                }
                String reversed = new String(characters);
                return reversed;

            }
        }


        String reversed1 = new String(characters);
        return reversed1;
    }
}