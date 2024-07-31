package dataStructureImplementations.heap;

import static utils.MyUtils.print;

@SuppressWarnings("DuplicatedCode")
public class BuildMaxHeap {


    public static void buildMaxHeap(int[] array){

        int internalNodesRange = (array.length/2) - 1;

        for(int i = internalNodesRange ; i >= 0; i--){
            heapify(array,i,array.length);
        }
    }

    // 0(log n))
    private static void heapify(int[] array, int i, int size) {


        int indexLchild = (2 * i) + 1;
        int indexRchild = (2 * i) + 2;
        int largest = i;

        if(indexLchild < size && array[indexLchild] > array[largest]){
            largest = indexLchild;
        }
        if(indexRchild < size && array[indexRchild] > array[largest]){
            largest = indexRchild;
        }
        if(largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array,largest,size);
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


