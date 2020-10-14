package LC3;

public class LC11Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right= height.length-1;

        for (int i = 0; i <height.length ; i++){
            //choose max between current max and new max
            //height is the min height between the rectangles
            max= Math.max(max,(right-left)*Math.min(height[left], height[right]));//area formula
            if ( height[left]<height[right]){//change pointer for the one that is smaller height
                left++;
            }else {
                right--;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int [] a= {2,3,4,5,18,17,6};

        System.out.println(maxArea(a));
    }
}
