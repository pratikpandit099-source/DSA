class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int num[]= new int[2];
        // for(int i =0;i<numbers.length;i++){
        //     for(int j=1;j<numbers.length;j++){
        //         if(i!=j){
        //         if(numbers[i]+numbers[j] == target){
                    
        //             return new int []{i+1,j+1};
        //         }

        //         }
        //     }
        // }
        // return new int[]{};

        int start =0;
        int end = numbers.length-1;
        while(start<end){
            int sum = numbers[start]+ numbers[end];
            if(sum == target){
                return new int[]{start+1,end+1};

            } else if(sum<target){
                start++;
               }
                 else{
                     end--;
                 }
            }
            return new int[]{};
        
    }
}