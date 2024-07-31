package algorithms;

//array must be sorted

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (array[mid] == target) return array[mid];

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
