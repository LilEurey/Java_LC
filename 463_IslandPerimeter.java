package Leetcode;

class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (j == 0 || grid[i][j - 1] == 0) ans++; //left
                    if (j == m - 1 || grid[i][j + 1] == 0) ans++; //right
                    if (i == 0 || grid[i - 1][j] == 0) ans++; //top
                    if (i == n - 1 || grid[i + 1][j] == 0) ans++; //bottom
                }
            }
        }
        return ans;
    }
}
