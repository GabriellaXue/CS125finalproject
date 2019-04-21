package com.example.cs125finalproject;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Game board.
 */
public class GameBoard extends AppCompatActivity {
    /**
     * List to store arraylist.
     */
    private int[][] board = new int[3][3];
    /**
     * playeroneid
     */
    private int playerOneId = 1;
    /**
     * playertwoid
     */
    private int playerTwoId = 2;
    /**
     * set board.
     * @param row row
     * @param column column
     * @param playerId playerId
     */
    public void setBoard(final int row, int column, final int playerId) {
        if (board[row][column] == 0) {
            board[row][column] = playerId;
        }
    }
    /**
     * Check if there's a winner
     * @return string
     */
    public int winnerId() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] != 0) {
                    return board[i][0];
                }
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] != 0) {
                    return board[0][i];
                }
            }
            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2])
                    || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
                if (board[1][1] != 0) {
                    return board[1][1];
                }
            }
        }
        return 0;

    }

    public void clearBoard() {
        board = new int[3][3];
    }
}
