import java.util.Stack;

public class LC42Trapping_Rain_Water_Hard {
    public static int trap(int[] height) {
        if (height == null || height.length < 2) return 0;

        Stack<Integer> stack = new Stack<>();
        int water = 0, i = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
                stack.push(i++);
            } else {
                int pre = stack.pop();
                if (!stack.isEmpty()) {
                    // find the smaller height between the two sides
                    int minHeight = Math.min(height[stack.peek()], height[i]);
                    // calculate the area
                    water += (minHeight - height[pre]) * (i - stack.peek() - 1);
                }
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
