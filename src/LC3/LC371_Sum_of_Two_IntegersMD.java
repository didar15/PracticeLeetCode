package LC3;

public class LC371_Sum_of_Two_IntegersMD {
    public static int getSum(int a, int b) {
        if(b==0) return a;
        //exclusive or (***^***) handles these cases: 1+0 and 0+1
        int k=a^b;
        //AND (***&***) handles this case: 1+1, where carry occurs,
        int carry = (a&b)<<1;

        return getSum(k, carry);
    }

    public static void main(String[] args) {
        int a=-5;
        int b=9;
        System.out.println(getSum(a,b));
    }
}
