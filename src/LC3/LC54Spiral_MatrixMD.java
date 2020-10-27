package LC3;

import java.util.ArrayList;
import java.util.List;

public class LC54Spiral_MatrixMD {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return res;
        }

        int rowBegin = 0;// start of row
        int rowEnd = matrix.length-1;//end of row
        int colBegin = 0;//start of col
        int colEnd = matrix[0].length - 1;//end of col

        while (rowBegin <= rowEnd && colBegin <= colEnd) {//while still in bound of matrix
            // Traverse Right (only col is changing)
            for (int col = colBegin; col <= colEnd; col ++) {
                res.add(matrix[rowBegin][col]);
            }
            rowBegin++;//increment row to go down to next row for next sprial iteration
            // Traverse Down (only row is changing)
            for (int row = rowBegin; row <= rowEnd; row ++) {
                res.add(matrix[row][colEnd]);
            }
            colEnd--;//decrement to move left for next sprial iteration

            // Traverse Left
            if (rowBegin <= rowEnd) {// to keep row in bound of matrix
                // Traverse Left (only col is changing)
                for (int col = colEnd; col >= colBegin; col --) {
                    res.add(matrix[rowEnd][col]);
                }
            }
            rowEnd--;//decrement row to go up for next sprial iteration

            // Travesre Up
            if (colBegin <= colEnd) {//keep col in bound of matrix
                // Travesre Up (only row is changing)
                for (int row = rowEnd; row >= rowBegin; row --) {
                    res.add(matrix[row][colBegin]);
                }
            }
            colBegin ++;//increment to go up for next sprial iteration
        }

        return res;

    }


    public static void main(String[] args) {
        int arr[][]= {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        System.out.println(spiralOrder(arr));
    }
}
