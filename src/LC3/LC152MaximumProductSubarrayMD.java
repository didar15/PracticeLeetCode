package LC3;

public class LC152MaximumProductSubarrayMD {
    public static int maxProduct(int[] nums) {
        if (nums.length==0) return -1;
        int curr_max= nums[0];
        int curr_min= nums[0];
        int final_max= nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp=curr_max;//stores previous curr
            //look for curr max
            curr_max=Math.max(
                    Math.max(curr_max*nums[i], curr_min*nums[i]), nums[i]);
            //looks for largest neg number
            curr_min=Math.min(
                    Math.min(temp*nums[i], curr_min*nums[i]), nums[i]);
            //store biggest value
            if (curr_max>final_max) {
                final_max= curr_max;
            }
        }
        return final_max;
    }

    public static void main(String[] args) {
        int [] a= {2,3,-2,4,9};
        System.out.println(maxProduct(a));
    }
}
