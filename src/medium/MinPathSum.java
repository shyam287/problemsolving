package medium;

import java.util.HashMap;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        return minPathSum(grid, 0, 0, grid.length, grid[0].length, new HashMap<String, Integer>());
    }

    int minPathSum(int[][] grid, int row, int col, int m, int n, HashMap<String, Integer> map) {

        String key=row+","+col;
        if(map.containsKey(key)) {
            return map.get(key);
        }

        if(row>=m || col>= n) {
            map.put(key,-1);
            return -1;
        }

        if(row == m-1 && col == n-1) {
            map.put(key,grid[row][col]);
            return grid[row][col];
        }

        int downSum = minPathSum(grid, row+1, col, m, n, map);
        int rightSum = minPathSum(grid, row, col+1, m, n, map);

        downSum = downSum != -1 ? downSum : Integer.MAX_VALUE;
        rightSum = rightSum != -1 ? rightSum : Integer.MAX_VALUE;

        int sum =  downSum < rightSum ? grid[row][col] + downSum : grid[row][col] + rightSum;
        map.put(key,sum);

        return sum;

    }
}
