package LC3;

public class LC200_Number_of_Islands_MD {
    public static int numIslands(char[][] grid) {
        if (grid==null) return 0;
        int landCount=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    landCount++;
                    dfs(grid,i,j);
                }
            }
        }
        return landCount;
    }

    private static void dfs(char[][] grid, int i, int j) {
        if (i<0|| i>= grid.length||j<0|| j>=grid[0].length|| grid[i][j]=='0')
            return;
        grid[i][j]='0';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
    public static void main(String[] args) {
        char arr[][] ={
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numIslands(arr));
    }
}
