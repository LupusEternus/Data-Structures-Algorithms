package dataStructureImplementations.heap;

import static utils.MyUtils.print;

public class BuildHeap {


    public static void buildMaxHeap(int[] array){

        int internalNodesRange = (array.length/2) - 1;

        for(int i = internalNodesRange ; i >= 0; i--){
            heapify(array,i);
        }
    }

    private static void heapify(int[] array, int i) {

        int heapSize = array.length;
        int indexLchild = (2 * i) + 1;
        int indexRchild = (2 * i) + 2;
        int largest = i;

        if(indexLchild < heapSize && array[indexLchild] > array[largest]){
            largest = indexLchild;
        }
        if(indexRchild < heapSize && array[indexRchild] > array[largest]){
            largest = indexRchild;
        }
        if(largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array,largest);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        print(arr);
        buildMaxHeap(arr);
        System.out.println();
        print(arr);
    }


}


