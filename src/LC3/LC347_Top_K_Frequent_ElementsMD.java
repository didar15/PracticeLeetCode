package LC3;

import java.util.*;

public class LC347_Top_K_Frequent_ElementsMD {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        //Create a frequency table
        for (int i = 0; i < nums.length; i++) {
            int count=  map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],count);
        }
        //Create a Max Heap and add all the distinct elements
        //will use map values to sort in heap in decending order
        //Queue<Integer> q = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        Queue<Integer> q = new PriorityQueue<>((a, b) -> map.get(b).compareTo(map.get(a)));

        //add all key values to heap
        //inputing keys which priority queue sorts by decending values

        for (int key: map.keySet()) {
            q.add(key);
        }
        int [] res= new int[k];
        //Poll top k frequent elements off the Heap
        for (int i = 0; i < k; i++) {
            res[i]=q.poll();
        }

        return res;

    }

    public static void main(String[] args) {
        int [] a={1,1,2,3,3,3};

        System.out.println(Arrays.toString(topKFrequent(a, 2)));
    }
}
