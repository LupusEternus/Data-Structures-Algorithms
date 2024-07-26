package sortingAlgo;

import static utils.MyUtils.*;


public class InsertionSort {

    //Quadratic time O(n^2)


    private static int[] insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

        }
    return  array;
    }
}
