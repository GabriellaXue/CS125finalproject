package com.example.cs125finalproject;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.example.cs125finalproject.GameBoard;
import java.util.ArrayList;



/**
 * Main class.
 */
public final class MainActivity extends AppCompatActivity {
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "TIC TAC TOE";
    /**
     * color value for playerone.
     */
    private final int playerone = Color.parseColor("#FFE26A1F");
    /**
     * color value for playertwo.
     */
    private final int playertwo = Color.parseColor("#FF102C75");
    /**
     * store input.
     */
    private GameBoard gameBoard;
    /**
     * count.
     */
    private int count;
    /**
     * max index.
     */
    private final int maxIndex = 3;
    /**
     * Store imageview.
     */
    private ArrayList<ImageView> boardView;
    /**
     * Run when this activity comes to the foreground.
     *
     * @param savedInstanceState unused
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView one = findViewById(R.id.one);
        final ImageView two = findViewById(R.id.two);
        final ImageView three = findViewById(R.id.three);
        final ImageView four = findViewById(R.id.four);
        final ImageView five = findViewById(R.id.five);
        final ImageView six = findViewById(R.id.six);
        final ImageView seven = findViewById(R.id.seven);
        final ImageView eight = findViewById(R.id.eight);
        final ImageView nine = findViewById(R.id.nine);
        boardView.add(one);
        boardView.add(two);
        boardView.add(three);
        boardView.add(four);
        boardView.add(five);
        boardView.add(six);
        boardView.add(seven);
        boardView.add(eight);
        boardView.add(nine);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    one.setBackgroundColor(playerone);
                    gameBoard.setBoard(0, 0, 0);
                } else {
                    one.setBackgroundColor(playertwo);
                    gameBoard.setBoard(0, 0, 1);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    two.setBackgroundColor(playerone);
                    gameBoard.setBoard(1, 0, 0);
                } else {
                    two.setBackgroundColor(playertwo);
                    gameBoard.setBoard(1, 0, 1);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    three.setBackgroundColor(playerone);
                    gameBoard.setBoard(2, 0, 0);
                } else {
                    three.setBackgroundColor(playertwo);
                    gameBoard.setBoard(2, 0, 1);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    four.setBackgroundColor(playerone);
                    gameBoard.setBoard(0, 1, 0);
                } else {
                    four.setBackgroundColor(playertwo);
                    gameBoard.setBoard(0, 1, 1);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    five.setBackgroundColor(playerone);
                    gameBoard.setBoard(1, 1, 0);
                } else {
                    five.setBackgroundColor(playertwo);
                    gameBoard.setBoard(1, 1, 1);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    six.setBackgroundColor(playerone);
                    gameBoard.setBoard(2, 1, 0);
                } else {
                    six.setBackgroundColor(playertwo);
                    gameBoard.setBoard(2, 1, 1);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    seven.setBackgroundColor(playerone);
                    gameBoard.setBoard(0, 2, 0);
                } else {
                    seven.setBackgroundColor(playertwo);
                    gameBoard.setBoard(0, 2, 1);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    eight.setBackgroundColor(playerone);
                    gameBoard.setBoard(1, 2, 0);
                } else {
                    eight.setBackgroundColor(playertwo);
                    gameBoard.setBoard(1, 2, 1);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                if (count % 2 == 1) {
                    nine.setBackgroundColor(playerone);
                    gameBoard.setBoard(2, 2, 0);
                } else {
                    nine.setBackgroundColor(playertwo);
                    gameBoard.setBoard(2, 2, 1);
                }
            }
        });

    }
    /**
     * display winner.
     * @param index index of winner
     */
    public void displayWinner(final int index) {
        if (index == 0) {
            for (ImageView view : boardView) {
                view.setBackgroundColor(playerone);
            }
            boardView.get(3).setBackgroundColor(playertwo);
            boardView.get(5).setBackgroundColor(playertwo);
            gameBoard.clearBoard();
        }
        if (index == 1) {
            for (ImageView view : boardView) {
                view.setBackgroundColor(playertwo);
            }
            boardView.get(3).setBackgroundColor(playerone);
            boardView.get(5).setBackgroundColor(playerone);
            gameBoard.clearBoard();
        }

    }
}