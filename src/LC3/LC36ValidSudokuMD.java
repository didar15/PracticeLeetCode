package LC3;

import java.util.HashSet;

public class LC36ValidSudokuMD {
    public static boolean isValidSudoku(String[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!board[i][j].equals(".")) {
                    String b= "(" + board[i][j] + ")";
                    if (!set.add(b+i) || !set.add(j+b)
                            || !set.add(i/3 +b + j/3))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
       String a[][]=
               {{"5","3",".",".","7",".",".",".","."}
               ,{"6",".",".","1","9","5",".",".","."}
               ,{".","9","8",".",".",".",".","6","."}
               ,{"8",".",".",".","6",".",".",".","3"}
               ,{"4",".",".","8",".","3",".",".","1"}
               ,{"7",".",".",".","2",".",".",".","6"}
               ,{".","6",".",".",".",".","2","8","."}
               ,{".",".",".","4","1","9",".",".","5"}
               ,{".",".",".",".","8",".",".","7","9"}};

        System.out.println(isValidSudoku(a));
    }
}
