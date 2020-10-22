package LC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1557Minimum_Num_of_VerticesMD {
    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        int[] seen = new int[n];
        // Calculate the inDegree for each node i.e.
        // the number of edges that end on that node
        for (List<Integer> e: edges)
            seen[e.get(1)] = 5;
        // The solution is the set of all edges that have inDegree 0
        // because you can't reach these nodes from any other node
        for (int i = 0; i < n; ++i)
            if (seen[i] == 0)
                res.add(i);
        return res;
    }

    public static void main(String[] args) {

        List<List<Integer>> a = new ArrayList(){
            {
                add(Arrays.asList(0,1));
                add(Arrays.asList(0,2));
                add(Arrays.asList(2,5));
                add(Arrays.asList(3,4));
                add(Arrays.asList(4,2));
            }
        };
        System.out.println(findSmallestSetOfVertices(6,a));
    }
}
