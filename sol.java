import java.util.ArrayList;
import java.util.Arrays;

class Solution {
        public static boolean isSafe(int row, int col, int[][] m, int vis[][], int n) {
            if (
                // Check if both row and column indices are within bounds
                    (row >= 0 && row < n) && (col >= 0 && col < n) &&
                            // Check if the cell contains a value of 1 (safe cell)
                            m[row][col] == 1 &&
                            // Check if the cell has not been visited
                            vis[row][col] != 1
            ) {
                return true; // The cell is safe
            }
            return false; // The cell is not safe
        }

        // Recursive function to find paths in the maze
        public static void solve(int row, int col, int[][] m, int vis[][], ArrayList<String> ans, String path, int n) {
            if (row == n - 1 && col == n - 1) {
                ans.add(path); // Reached the destination
                return;
            }

            // Mark the current cell as visited
            vis[row][col] = 1;

            // Explore all possible movements

            // Down
            if (isSafe(row + 1, col, m, vis, n)) {
                solve(row + 1, col, m, vis, ans, path + "D", n);
            }

            // Left
            if (isSafe(row, col - 1, m, vis, n)) {
                solve(row, col - 1, m, vis, ans, path + "L", n);
            }

            // Right
            if (isSafe(row, col + 1, m, vis, n)) {
                solve(row, col + 1, m, vis, ans, path + "R", n);
            }

            // Up
            if (isSafe(row - 1, col, m, vis, n)) {
                solve(row - 1, col, m, vis, ans, path + "U", n);
            }

            // Mark the current cell as unvisited (backtrack)
            vis[row][col] = 0;
        }

        // Main function to find paths in the maze
        public static ArrayList<String> findPath(int[][] m, int n) {
            ArrayList<String> ans = new ArrayList<>();
            int vis[][] = new int[n][n];

            // Initialize the visited array with zeros
            for (int i = 0; i < n; i++) {
                Arrays.fill(vis[i], 0);
            }

            String path = "";

            // If the starting cell is not safe, return an empty list
            if (m[0][0] == 0) {
                return ans;
            }

            // Find paths using the recursive solver
            solve(0, 0, m, vis, ans, path, n);
            return ans;
        }

    public static void main(String[] args) {
        int n = 4;
        int m[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};

        System.out.println(findPath(m,4));
    }
}
