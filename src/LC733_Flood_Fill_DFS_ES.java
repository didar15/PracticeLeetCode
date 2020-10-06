public class LC733_Flood_Fill_DFS_ES {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //changing pixel color "1" from intial row(sr) and column(sc) to new color "2"
        //if the starting pixel is already that color then no point doing anything
        if (image[sr][sc] == newColor) return image;
        //create helper function for DFS recursiob
        fill(image, sr, sc, image[sr][sc], newColor);
        //return new 2D array
        return image;
    }
    private static void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) return;
        //basically we want to check bewtwwen "0" sr to end of sr
        // and 0 sc to end of sc,
        // and check that the poistion of each pixel in image is not the pixel color already
        //if not changed then change to "newColor" value
        image[sr][sc] = newColor;//starting pixel we intially start from
        fill(image, sr + 1, sc, color, newColor);//check top
        fill(image, sr - 1, sc, color, newColor);//check down
        fill(image, sr, sc + 1, color, newColor);//check right
        fill(image, sr, sc - 1, color, newColor);//check left
    }
    public static void main(String[] args) {


        int [][] a= {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};

        //System.out.println(letterCombinations("233"));

    }

}
