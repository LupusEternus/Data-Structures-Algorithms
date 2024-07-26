package sortingAlgo;

 /*


      run-time complexity - Best case Quasilinear 0(n * log n)
                            Average case Quasilinear 0(n * log n)
                            Worst case 0(n^2) if already sorted
      space complexity    - 0(n)

 */

public class MergeSort {

    public static void mergeSort(int[] array){

        int length = array.length;
        if(length <= 1) return;

        int middle = array.length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i =0,j = 0;
        for(; i<length;i++){
            if(i < middle){
               leftArray[i] = array[i];
            }else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;

        int l = 0;
        int r = 0;
        int i = 0;

        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                l++;
                i++;
            }else {
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }

}
