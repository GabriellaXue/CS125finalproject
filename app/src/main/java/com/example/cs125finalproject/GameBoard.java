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
    private ArrayList<ArrayList<Integer>> board;
    /**
     * constrcutor for gameboard.
     * @param value setboard.
     */
    public GameBoard(final ArrayList<ArrayList<Integer>> value) {
        board = value;
    }

    /**
     * set board.
     * @param row row
     * @param column column
     * @param color color
     */
    public void setBoard(final int row, int column, final int color) {
        if (hasWon(row, column, color)) {
            return;
        }
        if (board.get(row).get(column) == null) {
            board.get(row).set(column, color);
        }
        return;
    }

    /**
     * Check if there's a winner
     * @return string
     */
    public Boolean hasWon(int row, int column, Object color) {
        return (board.get(row).get(0) == color && board.get(row).get(1) == color && board.get(row).get(2) == color)
                || (board.get(0).get(column) == color && board.get(1).get(column) == color && board.get(2).get(column) == color)
                || (board.get(0).get(0) == color && board.get(1).get(1) == color && board.get(2).get(2) == color)
                || (board.get(0).get(2) == color && board.get(1).get(1) == color && board.get(2).get(0) == color);
    }

    public void clearBoard() {
        ArrayList<ArrayList<Integer>> newValue = new ArrayList<ArrayList<Integer>>();
        GameBoard newBoard = new GameBoard(newValue);
        board = newBoard.board;
    }
}
