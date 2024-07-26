package sortingAlgo;

public class QuickSort {

 /*
      quick sort moves smaller elements to left of a pivot.
      recursively divide array in 2 partitions

      run-time complexity - Best case Quasilinear 0(n * log n)
                            Average case Quasilinear 0(n * log n)
                            Worst case 0(n^2) if already sorted
      space complexity    - 0(log n) -due to recursion

 */

    public static void quickSort(int[] arr, int start, int end){
        if(end<=start) return;
        int pivot = partition(arr,start,end);

        quickSort(arr,start,pivot -1);
        quickSort(arr,pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int j = start - 1;
        int pivot = arr[end];
        for(int i = start; i < end;i++){
            if(arr[i] < pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[j];
        arr[j] = pivot;
        arr[end] = temp;

        return j;
    }
}
