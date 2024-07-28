package sortingAlgo;

@SuppressWarnings("DuplicatedCode")
public class HeapSort {


    /*
     we are assuming that we are sorting a Heap DS, if not we must build Heap(max or min)
     time complexity = 0(n log n)
    */


    public static void HeapSortASC(int[] maxHeap) {

        int size = maxHeap.length - 1;

        for (int i = size; i > 0; i--) {
            int temp = maxHeap[0];
            maxHeap[0] = maxHeap[i];
            maxHeap[i] = temp;

            heapify(maxHeap, 0, i);
        }
    }

    private static void heapify(int[] maxHeap, int i, int size) {

        int indexLeftChild = (i * 2) + 1;
        int indexRightChild = (i * 2) + 2;
        int largest = i;
        if (indexLeftChild < size && maxHeap[indexLeftChild] > maxHeap[largest]) {
            largest = indexLeftChild;
        }
        if (indexRightChild < size && maxHeap[indexRightChild] > maxHeap[largest]) {
            largest = indexRightChild;
        }
        if (largest != i) {
            int tmp = maxHeap[largest];
            maxHeap[largest] = maxHeap[i];
            maxHeap[i] = tmp;
            heapify(maxHeap, largest, size);
        }
    }

    public static void main(String[] args) {
        int[] maxHeap = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};

        System.out.println("Original array:");
        for (int i : maxHeap) {
            System.out.print(i + " ");
        }
        HeapSortASC(maxHeap);

        System.out.println("\nSorted array:");
        for (int i : maxHeap) {
            System.out.print(i + " ");
        }
    }

}
