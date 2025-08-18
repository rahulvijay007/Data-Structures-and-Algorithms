public class sudoku {

    public static boolean solve(int s[][], int r, int c) {
        if (r == 9) return true; // finished all rows

        int nr = r, nc = c + 1;
        if (nc == 9) {
            nr = r + 1;
            nc = 0;
        }

        if (s[r][c] != 0) {
            return solve(s, nr, nc);
        }

        for (int d = 1; d <= 9; d++) {
            if (isSafe(s, r, c, d)) {
                s[r][c] = d;
                if (solve(s, nr, nc)) return true;
                s[r][c] = 0; // backtrack
            }
        }

        return false;
    }

    public static boolean isSafe(int s[][], int r, int c, int d) {
        // row
        for (int j = 0; j < 9; j++) {
            if (s[r][j] == d) return false;
        }
        // column
        for (int i = 0; i < 9; i++) {
            if (s[i][c] == d) return false;
        }
        // 3x3 box
        int boxRowStart = (r / 3) * 3;
        int boxColStart = (c / 3) * 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (s[i][j] == d) return false;
            }
        }
        return true;
    }

    public static void printBoard(int s[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int s[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(s, 0, 0)) {
            System.out.println("Sudoku solved successfully!");
            printBoard(s);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
