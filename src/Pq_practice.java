import java.util.PriorityQueue;

public class Pq_practice {


    public static void main(String[] args) {

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);

        maxPQ.add(6);
        maxPQ.add(1);
        maxPQ.add(9);
        maxPQ.add(3);
//        maxPQ.add(4);
//        maxPQ.add(8);
//        maxPQ.add(2);
//        System.out.println(maxPQ);
//        System.out.println(maxPQ.poll());
//        System.out.println(maxPQ.poll());
//        System.out.println(maxPQ.poll());
//        System.out.println(maxPQ.poll());
        // There is overflow problem when using simple lambda as comparator, as pointed out by Фима Гирин.
// PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);

        PriorityQueue<Integer> pq =new PriorityQueue<>((x, y) -> Integer.compare(y, x));

        pq.add(9);
        pq.add(5);

        System.out.println(pq.peek());


    }
}
