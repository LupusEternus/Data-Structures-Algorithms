package dataStructureImplementations.heap;

import java.util.Arrays;

public class MaxHeap {

    private int[] Heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        Heap = new int[this.maxSize];
        size = 0;

    }
    private  int leftChild(int parent){

        return (2*parent) + 1;
    }
    private  int rightChild(int parent){

        return (2*parent) + 2;
    }

    private void heapifyDown(int index){
        int largest = index;
        int leftChildIndex = leftChild(index);
        int rightChildIndex = rightChild(index);

        if(leftChildIndex < size && Heap[leftChildIndex] > Heap[largest] ){
            largest = leftChildIndex;
        }
        if(rightChildIndex < size && Heap[rightChildIndex] > Heap[largest]){
            largest = rightChildIndex;
        }
        if(largest != index){
            swap(largest,index);
            heapifyDown(largest);
        }
    }


    public int extractMax(){
        if(size == 0){
            throw  new IllegalStateException("Heap is empty");
        }
        int max = Heap[0];
        Heap[0] = Heap[size-1];
        size--;
        heapifyDown(0);

        return max;
    }
    public void increaseKey(int index,int val){
        Heap[index] += val;
        heapifyUp(index);


    }
    public void decreaseKey(int index, int val){
        Heap[index] -= val;
        heapifyDown(index);

    }
    public  void insertKey(int val){
        ensureCapacity();
        Heap[size] = val;
        size++;
        heapifyUp(size - 1);


    }
    private void ensureCapacity(){

        if(size + 1 >= maxSize){
            maxSize *=2;
            Heap = Arrays.copyOf(Heap,maxSize);
        }
    }
    private  int indexOfParent(int index){

        return (index -1)/2;
    }
    private void heapifyUp(int index){

       while(index > 0 && Heap[index] > Heap[indexOfParent(index)]){
           swap(index,indexOfParent(index));
           index = indexOfParent(index);
       }
    }
    private void swap(int posA, int posB){
        int temp = Heap[posA];
        Heap[posA] = Heap[posB];
        Heap[posB] = temp;
    }
}
