package medium;

public class UniquePath {

    public int uniquePaths(int m, int n) {

        int[][] pathFound = new int[m][n];
        return uniquePaths( 0, 0, m, n, pathFound);

    }

    private int uniquePaths(int row, int col, int m, int n, int[][] pathFound) {

        if(row == m-1 && col == n -1) {
            pathFound[row][col] = 1;
            return 1;
        }

        if(row > m-1 || col > n-1) {
            return 0;
        }

        if(pathFound[row][col] > 0) {
            return pathFound[row][col];
        }

        pathFound[row][col] = uniquePaths(row+1, col, m, n, pathFound) + uniquePaths(row, col+1, m, n, pathFound);
        return pathFound[row][col];
    }
}
