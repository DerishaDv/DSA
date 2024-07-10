package Recursion.medium;

import java.awt.*;
import java.util.Vector;

public class FloodFillAlgorithmBFS {
    public static void main(String[] args) {
        int[][] pixels = {{2, 3, 1, 2, 5, 1},
                {3, 1, 1, 1, 2, 4},
                {1, 1, 1, 5, 0, 9},
                {9, 0, 1, 5, 0, 9},
                {2, 3, 1, 2, 5, 1},
                {3, 1, 1, 1, 2, 4}};
        int row = 4, col = 2, fresh = 6;

        floodFillBFS(pixels, fresh, pixels[row][col], row, col, pixels.length, pixels[0].length);

        for (int[] x : pixels) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    

    /**
     * USING BREADTH FIRST SEARCH ALGORITHM
     */
    private static void floodFillBFS(int[][] pixels, int fresh, int old, int r, int c, int rows, int cols) {

        Vector<Point> queue = new Vector<>();
        queue.add(new Point(r, c));
        pixels[r][c] = fresh;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};


        while (queue.size() > 0) {
            Point currentPixel = queue.lastElement();
            queue.remove(queue.lastElement());
            int x = currentPixel.x;
            int y = currentPixel.y;


            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX < 0 || newY < 0 || newX >= rows || newY >= cols || pixels[newX][newY] != old) continue;
                pixels[newX][newY] = fresh;
                queue.add(new Point(newX, newY));
            }
        }
    }
}
