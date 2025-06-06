import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Row check
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (rowSet.contains(c)) return false;
                    rowSet.add(c);
                }
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            HashSet<Character> columnSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (columnSet.contains(c)) return false;
                    columnSet.add(c);
                }
            }
        }

        // Square check using 2 offsets
        int rowOffset = 0;
        while (rowOffset <= 6) {
            int colOffset = 0;
            while (colOffset <= 6) {
                HashSet<Character> squareSet = new HashSet<>();
                int i = 0;
                while (i < 3) {
                    int j = 0;
                    while (j < 3) {
                        char c = board[rowOffset + i][colOffset + j];
                        if (c != '.') {
                            if (squareSet.contains(c)) return false;
                            squareSet.add(c);
                        }
                        j++;
                    }
                    i++;
                }
                colOffset += 3;
            }
            rowOffset += 3;
        }

        return true;
    }
}
