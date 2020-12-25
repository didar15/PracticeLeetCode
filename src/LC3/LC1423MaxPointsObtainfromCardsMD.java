package LC3;

public class LC1423MaxPointsObtainfromCardsMD {
    public static int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int end = cardPoints.length-1;
        int sumLeft = 0;
        int rightSum = 0;

        for(int i = 0; i < k; ++i){
            sumLeft += cardPoints[i];
        }
         max = sumLeft;
        for(int i = 0; i < k; ++i){
            rightSum += cardPoints[end--];
            //take out the end card form left side and add first right side
            sumLeft -= cardPoints[k-1-i];
            max = Math.max(max,sumLeft+rightSum);
        }
        return max;
    }

    public static void main(String[] args) {
        int [] a={11,49,100,20,86,29,72};
        //232
        System.out.println(maxScore(a,4));
    }
}
