import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board.length; j+=3) {
                if (!isValidBox(board, i , j)) return false;
            }
        }   
        for (char[] arr : board) {
            Set<Character> rowSet = new HashSet<Character>();
            for (char ch : arr) {
                if (ch == '.') continue;
                if (rowSet.contains(ch)) return false;
                rowSet.add(ch);
            }
        }
        for (int i = 0; i < board.length; i++) {
            Set<Character> colSet = new HashSet<Character>();
            for (int j = 0; j < board.length; j++) {
                char ch = board[j][i];
                if (ch == '.') continue;
                if (colSet.contains(ch)) return false;
                colSet.add(ch);
            }
        } 
        return true;     
    }
    public boolean isValidBox(char[][] board, int i, int j) {
        int stopC = i + 3;
        int stopR = j + 3;
        Set<Character> set = new HashSet<Character>();
        for (int c = i; c < stopC; c++) {
            for (int r = j; r < stopR; r++) {
                char ch = board[c][r];
                if (ch == '.') continue;
                if (set.contains(ch)) {
                    return false;
                }
                set.add(ch);
            }
        }
        return true;
    }
}
