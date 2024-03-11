// package Sorting;

class BubbleSort {

    static void bubbleSort(int arr[]) {
        int arr2[] = arr;
        for (int i = 0; i <= arr2.length - 2; i++) {

            for (int j = 0; j <= (arr2.length) - i - 2; j++) {
                int temp;
                if (arr2[j] > arr2[j + 1]) {
                    temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }

            }
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
        bubbleSort(arr);

    }
}