package LC3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC189RotateArrayMD {
    public static int [] rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        //will rotate array
        for (int i = 0; i < nums.length; i++) {
            // the number at index ii in the original array is placed
            // at the index (i + k) % nums.length.
            a[(i + k) % nums.length] = nums[i];
        }
        //add new array values to orignal array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(a, 3)));

    }
}
