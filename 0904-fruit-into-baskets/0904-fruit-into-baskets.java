class Solution {
    public int totalFruit(int[] fruits) {
        int maxLength =0;
        int l=0;
        int r=0;
        Map <Integer,Integer> map = new HashMap<>();
        while(r<fruits.length){
            // to add element in hashmap
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
           while(map.size()>2){
                map.put(fruits[l], map.get(fruits[l]) - 1);

                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;

            }
           
                 maxLength = Math.max(maxLength,r-l+1);
                 r++;
           
            }
            return maxLength;
        }
        
    }
