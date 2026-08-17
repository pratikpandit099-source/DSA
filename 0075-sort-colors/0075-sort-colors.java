class Solution {
    //Solution by selection sort
    public void sortColors(int[] arr) {
       sort(arr);
       System.out.println(Arrays.toString(arr));
    }
     static void sort(int arr[]){
        for(int i = 0;i< arr.length;i++){
            //find the max element in the remaining array and swap with corect index
            int last = arr.length -1-i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
        

    }
    static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int  getMaxIndex(int arr[],int start,int end){
        int max= start;
        for(int i = start;i<=end;i++){
             if (arr[max] < arr[i]) {
                 max = i;
             }
        }
        return max;
    }
    // solution by bubble sort
    //  boolean Swapped;
    //     for (int i = 0; i <arr.length ; i++) {
    //         Swapped = false;
    //         for (int j = 1; j <   arr.length-i; j++) {

    //             if(arr[j]<arr[j-1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //                 Swapped= true;

    //             }
    //         }
    //         if (!Swapped) {
    //             break;
    //         }

    //     }

    // }
    }
