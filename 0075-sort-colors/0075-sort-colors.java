class Solution {
    public void sortColors(int[] arr) {
         boolean Swapped;
        for (int i = 0; i <arr.length ; i++) {
            Swapped = false;
            for (int j = 1; j <   arr.length-i; j++) {

                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    Swapped= true;

                }
            }
            if (!Swapped) {
                break;
            }

        }

    }
    }
