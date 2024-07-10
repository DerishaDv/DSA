package Recursion.medium;

public class FloodFillAlgorithm {
    // using Depth First Search Approach
    public static void main(String[] args) {
        int[][] pixels = {{2, 3, 1, 2, 5, 1},
                {3, 1, 1, 1, 2, 4},
                {1, 1, 1, 5, 0, 9},
                {9, 0, 1, 5, 0, 9},
                {2, 3, 1, 2, 5, 1},
                {3, 1, 1, 1, 2, 4}};
        int row = 4, col = 2, fresh = 6;

        floodFill(pixels, fresh, pixels[row][col], row, col, pixels.length, pixels[0].length);
        for (int[] x : pixels) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private static void floodFill(int[][] pixels, int fresh, int old, int r, int c, int rows, int cols) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || pixels[r][c] != old) return;
        pixels[r][c] = fresh;
        //Recursively fill the adjacant elements to the new color
        floodFill(pixels, fresh, old, r - 1, c, rows, cols);
        floodFill(pixels, fresh, old, r + 1, c, rows, cols);
        floodFill(pixels, fresh, old, r, c - 1, rows, cols);
        floodFill(pixels, fresh, old, r, c + 1, rows, cols);
    }
}
