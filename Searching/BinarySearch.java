public class BinarySearch {

    public static int binary_search(int[] array, int target) {
        int arr[] = array;
        int targets = target;

        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 8, 9, 45, 55 };
        int target = 45;
        System.out.println(binary_search(arr, target));
    }
}
