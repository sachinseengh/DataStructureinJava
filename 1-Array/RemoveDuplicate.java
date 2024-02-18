
//  Given a sorted arrayay nums, remove the duplicates in
// place such that each element appears only once and
// returns the new length.

public class RemoveDuplicate {

    public static void removeDuplicate(int[] arr) {
        int[] array = arr;
        int i = 0;
        

        for (int j = 1; j < array.length; j++) {
            if (array[i] != array[j]) {
                i++;
                array[i] = array[j];

            }
        }

     

        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
        System.out.println("The length of arrayay after removing duplicate is " + (i + 1));
    }

    public static void main(String[] args) {

        int array[] = { 1, 1, 2, 3, 3, 4, 5, 5 };

        removeDuplicate(array);
    }
}
