package sortingAlgo;

import static utils.MyUtils.*;

public class SelectionSort {

    //Quadratic time O(n^2)


    private static int[] selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length;j++ ){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return  array;
    }
}
