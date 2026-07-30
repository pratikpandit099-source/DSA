class Solution {
     public int peakIndexInMountainArray(int[] arr) {
        int start = 0; 
        int end = arr.length-1;
        while(start<end){
             int mid = start +(end - start) / 2 ;
        if(arr[mid]>arr[mid+1]){
            //means we are descending part of array
            //this may be the ans , but look at keft side
            //thats why end != mid -1
            end = mid;
        }else
            {
                //we are in ascending part of array
                //we have to cheak in right side
                //we cheak the condition for element at mid < ele at mid+1
                start = mid + 1;

        }

        }
       
        //at the last step start == end having the peek value
        //only one element is remaining in last step we are looking for
        return end;//we can also return end both hsve same value
    }
}