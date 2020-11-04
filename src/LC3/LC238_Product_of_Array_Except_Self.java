package LC3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LC238_Product_of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1;
        int right=1;
        //storing left values
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }
        //storing right values
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] a= {9,0,-2};
        int [] b= {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(b)));
    }
}
