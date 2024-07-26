package sortingAlgo;

import static utils.MyUtils.*;

public class BubbleSort {

    //Quadratic time O(n^2)

    private static int[] bubbleSort(int[] array) {

        int size = array.length-1;
        for(int i = 0; i < size; i++){
            boolean swaped = false;
            for(int j = 0; j < size - i;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }

        return  array;
    }
}
