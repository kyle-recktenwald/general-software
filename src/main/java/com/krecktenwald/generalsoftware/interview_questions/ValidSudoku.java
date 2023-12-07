package com.krecktenwald.generalsoftware.interview_questions;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Check rows
                System.out.printf("Checking: %d, %d - Value: %s %n", i, j, board[i][j]);

                if (board[i][j] != '.' && rowCheck[board[i][j] - '1']) {
                    return false;
                }
                if (board[i][j] != '.') {
                    rowCheck[board[i][j] - '1'] = true;
                }

                // Check columns
                if (board[j][i] != '.' && colCheck[board[j][i] - '1']) {
                    return false;
                }
                if (board[j][i] != '.') {
                    colCheck[board[j][i] - '1'] = true;
                }

                // Check 3x3 sub-boxes
                int boxRowIndex = 3 * (i / 3);
                int boxColIndex = 3 * (i % 3);

                System.out.printf("Current Box Row Index: %d, Current Box Column Index: %d %n", boxRowIndex, boxColIndex);
                if (board[boxRowIndex + j / 3][boxColIndex + j % 3] != '.' &&
                        boxCheck[board[boxRowIndex + j / 3][boxColIndex + j % 3] - '1']) {
                    return false;
                }
                if (board[boxRowIndex + j / 3][boxColIndex + j % 3] != '.') {
                    boxCheck[board[boxRowIndex + j / 3][boxColIndex + j % 3] - '1'] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board1 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Output for Example 1: " + isValidSudoku(board1));

        char[][] board2 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Output for Example 2: " + isValidSudoku(board2));
    }
}
