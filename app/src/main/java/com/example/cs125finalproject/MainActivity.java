package com.example.cs125finalproject;


import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



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
    private GameBoard gameBoard = new GameBoard();
    /**
     * count.
     */
    private int count;
    /**
     * max index.
     */
    /**
     * prevent duplicate click.
     */
    private int counterOne;
    private int counterTwo;
    private int counterThree;
    private int counterFour;
    private int counterFive;
    private int counterSix;
    private int counterSeven;
    private int counterEight;
    private int counterNine;
    private final int maxIndex = 3;
    /**
     * Run when this activity comes to the foreground.
     *
     * @param savedInstanceState unused
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        final ImageView one = findViewById(R.id.one);
        final ImageView two = findViewById(R.id.two);
        final ImageView three = findViewById(R.id.three);
        final ImageView four = findViewById(R.id.four);
        final ImageView five = findViewById(R.id.five);
        final ImageView six = findViewById(R.id.six);
        final ImageView seven = findViewById(R.id.seven);
        final ImageView eight = findViewById(R.id.eight);
        final ImageView nine = findViewById(R.id.nine);
        restartClicked();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterOne++;
                if (counterOne == 1) {
                    if (count % 2 == 1) {
                        one.setBackgroundColor(playerone);
                        gameBoard.setBoard(0, 0, 1);
                    } else {
                        one.setBackgroundColor(playertwo);
                        gameBoard.setBoard(0, 0, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterTwo++;
                if (counterTwo == 1) {
                    if (count % 2 == 1) {
                        two.setBackgroundColor(playerone);
                        gameBoard.setBoard(1, 0, 1);
                    } else {
                        two.setBackgroundColor(playertwo);
                        gameBoard.setBoard(1, 0, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterThree++;
                if (counterThree == 1) {
                    if (count % 2 == 1) {
                        three.setBackgroundColor(playerone);
                        gameBoard.setBoard(2, 0, 1);
                    } else {
                        three.setBackgroundColor(playertwo);
                        gameBoard.setBoard(2, 0, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterFour++;
                if (counterFour == 1) {
                    if (count % 2 == 1) {
                        four.setBackgroundColor(playerone);
                        gameBoard.setBoard(0, 1, 1);
                    } else {
                        four.setBackgroundColor(playertwo);
                        gameBoard.setBoard(0, 1, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterFive++;
                if (counterFive == 1) {
                    if (count % 2 == 1) {
                        five.setBackgroundColor(playerone);
                        gameBoard.setBoard(1, 1, 1);
                    } else {
                        five.setBackgroundColor(playertwo);
                        gameBoard.setBoard(1, 1, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterSix++;
                if (counterSix == 1) {
                    if (count % 2 == 1) {
                        six.setBackgroundColor(playerone);
                        gameBoard.setBoard(2, 1, 1);
                    } else {
                        six.setBackgroundColor(playertwo);
                        gameBoard.setBoard(2, 1, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterSeven++;
                if (counterSeven == 1) {
                    if (count % 2 == 1) {
                        seven.setBackgroundColor(playerone);
                        gameBoard.setBoard(0, 2, 1);
                    } else {
                        seven.setBackgroundColor(playertwo);
                        gameBoard.setBoard(0, 2, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterEight++;
                if (counterEight == 1) {
                    if (count % 2 == 1) {
                        eight.setBackgroundColor(playerone);
                        gameBoard.setBoard(1, 2, 1);
                    } else {
                        eight.setBackgroundColor(playertwo);
                        gameBoard.setBoard(1, 2, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                count++;
                counterNine++;
                if (counterNine == 1) {
                    if (count % 2 == 1) {
                        nine.setBackgroundColor(playerone);
                        gameBoard.setBoard(2, 2, 1);
                    } else {
                        nine.setBackgroundColor(playertwo);
                        gameBoard.setBoard(2, 2, 2);
                    }
                    if (gameBoard.winnerId() > 0) {
                        displayWinner(gameBoard.winnerId());
                    }
                }
            }
        });

    }
    /**
     * display winner.
     * @param index index of winner
     */
    public void displayWinner(final int index) {
        if (index == 1) {
            findViewById(R.id.one).setBackgroundColor(playerone);
            findViewById(R.id.two).setBackgroundColor(playerone);
            findViewById(R.id.three).setBackgroundColor(playerone);
            findViewById(R.id.four).setBackgroundColor(playertwo);
            findViewById(R.id.five).setBackgroundColor(playerone);
            findViewById(R.id.six).setBackgroundColor(playertwo);
            findViewById(R.id.seven).setBackgroundColor(playerone);
            findViewById(R.id.eight).setBackgroundColor(playerone);
            findViewById(R.id.nine).setBackgroundColor(playerone);
            gameBoard.clearBoard();
            counterOne = 0;
            counterTwo = 0;
            counterThree = 0;
            counterFour = 0;
            counterFive = 0;
            counterSix = 0;
            counterSeven = 0;
            counterEight = 0;
            counterNine = 0;

        }
        if (index == 2) {
            findViewById(R.id.one).setBackgroundColor(playertwo);
            findViewById(R.id.two).setBackgroundColor(playertwo);
            findViewById(R.id.three).setBackgroundColor(playertwo);
            findViewById(R.id.four).setBackgroundColor(playerone);
            findViewById(R.id.five).setBackgroundColor(playertwo);
            findViewById(R.id.six).setBackgroundColor(playerone);
            findViewById(R.id.seven).setBackgroundColor(playertwo);
            findViewById(R.id.eight).setBackgroundColor(playertwo);
            findViewById(R.id.nine).setBackgroundColor(playertwo);
            gameBoard.clearBoard();
            counterOne = 0;
            counterTwo = 0;
            counterThree = 0;
            counterFour = 0;
            counterFive = 0;
            counterSix = 0;
            counterSeven = 0;
            counterEight = 0;
            counterNine = 0;
        }
    }
    private void restartClicked() {
        Button restart = findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Start.class));
            }
        });
    }
}