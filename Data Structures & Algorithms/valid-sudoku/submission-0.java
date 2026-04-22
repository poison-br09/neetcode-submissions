public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use sets to track seen numbers in rows, columns, and 3x3 subgrids
        boolean[][] rows = new boolean[9][9];  // To track seen numbers in rows
        boolean[][] cols = new boolean[9][9];  // To track seen numbers in columns
        boolean[][] subGrids = new boolean[9][9];  // To track seen numbers in 3x3 subgrids
        
        // Traverse the entire board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                
                if (current == '.') {
                    continue;  // Skip empty cells
                }
                
                int num = current - '1';  // Convert char to index (0-8)
                int subGridIndex = (i / 3) * 3 + (j / 3);  // Calculate subgrid index (0-8)
                
                // Check if the current number is already seen in the row, column, or subgrid
                if (rows[i][num] || cols[j][num] || subGrids[subGridIndex][num]) {
                    return false;  // Invalid if the number is seen in any of these places
                }
                
                // Mark the number as seen in the row, column, and subgrid
                rows[i][num] = true;
                cols[j][num] = true;
                subGrids[subGridIndex][num] = true;
            }
        }
        
        return true;  // If no conflicts are found, the board is valid
    }
}
