// package Sorting;

class SelectionSort {

    static void selectionSort(int arr[]) {
        int arr2[] = arr;
        for (int i = 0; i < arr2.length - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < (arr2.length); j++) {

                if (arr2[j] < arr2[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
        printarr(arr2);
    }

    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 2, 10, 45, 41 };
        selectionSort(arr);

    }
}