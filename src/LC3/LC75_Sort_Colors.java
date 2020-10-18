package LC3;

import java.util.Arrays;

public class LC75_Sort_Colors {
    public static void sortColors(int[] nums) {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;

        for (int i = 0; i < nums.length; i++) {
            //count of each variable in array
            if (nums[i]==0) zeroCount++;
            if (nums[i]==1) oneCount++;
            if (nums[i]==2) twoCount++;
        }
        for (int i = 0; i < nums.length; i++) {
            //add as many of that variable in count
            if (i<zeroCount) nums[i]=0;
            else if(i<zeroCount+oneCount) nums[i]=1;
            else nums[i]=2;
        }
    }

    public static void main(String[] args) {
        int a[]= {2,0,2,1,1,0};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }
}
