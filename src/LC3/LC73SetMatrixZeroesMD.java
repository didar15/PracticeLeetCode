package LC3;

import java.util.Arrays;
import java.util.HashSet;

public class LC73SetMatrixZeroesMD {
    public static int[][] setZeroes(int[][] matrix) {
        if (matrix == null)
            return null;
        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> col = new HashSet<Integer>();
        HashSet<Integer> row = new HashSet<Integer>();
        for(int i=0; i<m; i++) {
            for(int j=0;j<n; j++) {
                if (matrix[i][j] == 0) {
                    col.add(j);
                    row.add(i);
                }
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if (col.contains(j) || row.contains(i))
                    matrix[i][j] = 0;
            }
        }
        return matrix;

}

    public static void main(String[] args) {
       int a[][]= {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.deepToString(setZeroes(a)));
    }
}
