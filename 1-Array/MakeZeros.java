// package 1-Array;

public class MakeZeros {
    public static void makeZero(int[] nums) {
        int current = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != 0) {
                nums[current] = nums[i];
                current++;
            }
        }
        // current reached to end of non zer
        for (int j = current; j <= nums.length - 1; j++) {
            nums[j] = 0;
        }
        for (int k = 0; k <= nums.length - 1; k++)
            System.out.println(nums[k]);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };

        makeZero(arr);
    }
}
