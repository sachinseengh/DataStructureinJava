// package 1-Array;

public class BinarySearch {

    public static void bSearch(int[] nums, int element) {

        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        if (nums[mid] == element) {
            System.out.println("Found at " + mid);
        } else if (element < nums[mid]) {
            for (int i = left; i < mid; i++) {
                System.out.println("Searchin at"+i);
                if (element == nums[i]) {
                    System.out.println("Found at " + i);
                }
            }
        } else if (element > nums[mid]) {
            for (int i = mid + 1; i <= right; i++) {
                System.out.println("Searchin at"+i);
                if (element == nums[i]) {
                    System.out.println("Found at " + i);
                }
            }
        } else {
            System.out.println("Not Found");
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        int search_element = 5;

        bSearch(nums, search_element);
    }
}
