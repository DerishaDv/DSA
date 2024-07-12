package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindPathsRightAndDown {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3},{4, 5, 6}};
        List<List<Integer>> paths = new ArrayList<>();
        findPath(grid, 0, 0, grid.length, grid[0].length, paths, new ArrayList<>());
        System.out.println(paths);
    }

    private static void findPath(int[][] grid, int i, int j, int rows, int cols, List<List<Integer>> paths, ArrayList<Integer> path) {
        // Base condition to return when the current row or col index crosses the indices rows or cols
        if(i==rows||j==cols) return;
        // Add the element to the path array
        path.add(grid[i][j]);
        // if the current element is the last index in the grid add the path to the paths
        if(i==rows-1&& j ==cols-1) paths.add(new ArrayList<>(path));
        // Take the downward path
        findPath(grid,i+1, j, rows, cols, paths, path);
        // Take the rightside path
        findPath(grid, i, j+1, rows, cols, paths, path);
        // Backtrack by removing the last element
        path.remove(path.size()-1);
    }
}
