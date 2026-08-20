class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int count =0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>=2)return nums[i];
        // }
        // return -1;
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        // it swappinfg the numbers but when already existing number is at the available on the correct place then cyclic sort ignore second occured element

        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return nums[j];

            }
        }
        return -1;
       

      
       
    }
     void swap (int nums[],int first,int second){
            int temp = nums[first];
            nums[first]=nums[second];
            nums[second]= temp;
        }
}   