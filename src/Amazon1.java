import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Amazon1 {
    public static int fiveStarReviews(List<List<Integer>> productRatings, int ratingsThreshold){

        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>((product1, product2) -> diffHelper(product2) - diffHelper(product1));
        int minRatingNeeded = 0;
        for(List<Integer> rating : productRatings) maxHeap.offer(rating);
        double currentRating = 0;
        for(List<Integer> rating : productRatings) {
            currentRating += 100.0 * rating.get(0) / rating.get(1);
        }

        while(currentRating < ratingsThreshold * productRatings.size()) {
            minRatingNeeded++;
            List<Integer> rating = maxHeap.poll();
            List<Integer> newRating = Arrays.asList(rating.get(0)+1, rating.get(1)+1);
            // updates current Rating
            currentRating = currentRating - 100.0 * rating.get(0) / rating.get(1) + 100.0 * newRating.get(0) / newRating.get(1);
            maxHeap.offer(newRating);
        }
        return minRatingNeeded;
    }


    private static int diffHelper(List<Integer> product) {
        double currentRating = 100.0 * product.get(0) / product.get(1);
        double newRating = 100.0 * (product.get(0)+1) / (product.get(1)+1);
        return (int)(newRating - currentRating);
    }

    public static void main(String[] args) {
        List<List<Integer>> ratings = new ArrayList(){
            {
                add(Arrays.asList(4,4));
                add(Arrays.asList(1,2));
                add(Arrays.asList(3,6));
            }
        };
        int threshold = 77;

        System.out.println(fiveStarReviews(ratings, threshold));
    }
}
