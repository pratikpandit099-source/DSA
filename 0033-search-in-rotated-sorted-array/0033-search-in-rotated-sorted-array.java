class Solution {
    static int search(int[]nums,int target){
    int pivot = findPivot(nums);
    // if we do not find pivot that means array is not rotated
    if(pivot ==-1){
        // just do binary search
        return binarySearch(nums, target, 0, nums.length-1);
    }
    if(target ==nums[pivot]){
        return pivot;
    }
    if(target>=nums[0]){
        return binarySearch(nums, target, 0, pivot-1);
       
    }
    return binarySearch(nums, target, pivot+1, nums.length-1);

 }
  static int  binarySearch(int []arr,int target,int start, int end){
       
      
        while(start<=end){
            int mid = start+(end - start)/2;
             if(target<arr[mid])
            {
                end = mid - 1;
            }
           
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
 static int findPivot(int[]arr){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
    int mid = start +(end-start)/2;
    //4 cases from here
    if( mid<end && arr[mid]>arr[mid+1]){
        return mid;

    }else if( mid>start && arr[mid]<arr[mid-1]){
        return mid-1;
        //left side is sorted ,pivot in right
    }else if(arr[start]>arr[mid]){
        end = mid-1;
        //right side sorted , pivot in left
    }else{
        start = mid+1;
    }
    
  }
  return-1;
}
}