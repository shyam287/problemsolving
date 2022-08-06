package medium;

import java.util.HashMap;

public class ObstacleGrid {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePath(obstacleGrid, 0, 0, obstacleGrid.length, obstacleGrid[0].length, new HashMap<String, Integer>());
    }

    int uniquePath(int[][] obstacleGrid, int row, int col, int m, int n, HashMap<String, Integer> map) {

        String key=row+","+col;
        if(map.containsKey(key)) {
            return map.get(key);
        }

        if(row>=m || col>= n) {
            map.put(key,0);
            return 0;
        }

        if(obstacleGrid[row][col] == 1) {
            map.put(key,0);
            return 0;
        }

        if(row == m-1 && col == n-1) {
            map.put(key,1);
            return 1;
        }

        int count = uniquePath(obstacleGrid, row+1, col, m, n, map) +
                uniquePath(obstacleGrid, row, col+1, m, n, map);

        map.put(key,count);

        return count;

    }
}
