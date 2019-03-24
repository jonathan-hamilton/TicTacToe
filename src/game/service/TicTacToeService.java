package game.service;

import game.controller.TicTacToeController;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeService {

    // class variables to keep track of who has won and whose turn it is
    private static boolean playerTurn = true;
    private static boolean player1Won = false;
    private static boolean player2Won = false;

    // checkForWin method to check all possibilities of winning tic tac toe
    public static void checkForWin(TicTacToeController board) {

        // checks for X winning
        if(board.button1.getText().equals("X")) {
            if(board.button2.getText().equals("X")) {
                if(board.button3.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }
        if(board.button4.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button6.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }
        if(board.button7.getText().equals("X")) {
            if(board.button8.getText().equals("X")) {
                if(board.button9.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }
        if(board.button1.getText().equals("X")) {
            if(board.button4.getText().equals("X")) {
                if(board.button7.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }
        if(board.button2.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button8.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }
        if(board.button3.getText().equals("X")) {
            if(board.button6.getText().equals("X")) {
                if(board.button9.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }
        if(board.button1.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button9.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }
        if(board.button3.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button7.getText().equals("X")) {
                    setPlayer1Won(true);
                    setPlayer2Won(false);
                }
            }
        }

        // checks for O winning
        if(board.button1.getText().equals("O")) {
            if(board.button2.getText().equals("O")) {
                if(board.button3.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button4.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button6.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button7.getText().equals("O")) {
            if(board.button8.getText().equals("O")) {
                if(board.button9.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button1.getText().equals("O")) {
            if(board.button4.getText().equals("O")) {
                if(board.button7.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button2.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button8.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button3.getText().equals("O")) {
            if(board.button6.getText().equals("O")) {
                if(board.button9.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button1.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button9.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button3.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button7.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(board.button3.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button7.getText().equals("O")) {
                    setPlayer1Won(false);
                    setPlayer2Won(true);
                }
            }
        }
        if(checkForCatsGame(board)){
            board.winnerLabel.setText("Cat's game, no winner");
        }
    }

    // Method to check for a stalemate
    private static boolean checkForCatsGame(TicTacToeController board) {
        if (
            (board.button1.getText().equals("X") || board.button1.getText().equals("O")) &&
            (board.button2.getText().equals("X") || board.button2.getText().equals("O")) &&
            (board.button3.getText().equals("X") || board.button3.getText().equals("O")) &&
            (board.button4.getText().equals("X") || board.button4.getText().equals("O")) &&
            (board.button5.getText().equals("X") || board.button5.getText().equals("O")) &&
            (board.button6.getText().equals("X") || board.button6.getText().equals("O")) &&
            (board.button7.getText().equals("X") || board.button7.getText().equals("O")) &&
            (board.button8.getText().equals("X") || board.button8.getText().equals("O")) &&
            (board.button9.getText().equals("X") || board.button9.getText().equals("O"))
        ) {return true;}
        else{return false;}
    }

    // Method called from Controller class to set text, check for win and switch turns
    public static void setTextCheckForWinAndSwitchPlayerTurn(Button button, TicTacToeController board){
        if(playerTurn){
            button.setText("X");
            checkForWin(board);
            if(isPlayer1Won()){
                board.winnerLabel.setText("Player 1 Won!!");
                disableButtons(board);
            }
            playerTurn = false;
        }else{
            button.setText("O");
            checkForWin(board);
            if(isPlayer2Won()){
                board.winnerLabel.setText("Player 2 Won!!");
                disableButtons(board);
            }
            playerTurn = true;
        }
    }

    // Disable buttons after game
    private static void disableButtons(TicTacToeController board) {
        List<Button> buttons = new ArrayList<>();
        buttons.add(board.button1);
        buttons.add(board.button2);
        buttons.add(board.button3);
        buttons.add(board.button4);
        buttons.add(board.button5);
        buttons.add(board.button6);
        buttons.add(board.button7);
        buttons.add(board.button8);
        buttons.add(board.button9);
        for(Button b : buttons){
            b.setDisable(true);
        }
    }

    // Reset
    public static void resetBoard(TicTacToeController board){
        board.button1.setText("");
        board.button2.setText("");
        board.button3.setText("");
        board.button4.setText("");
        board.button5.setText("");
        board.button6.setText("");
        board.button7.setText("");
        board.button8.setText("");
        board.button9.setText("");
        board.winnerLabel.setText("");
        setPlayer1Won(false);
        setPlayer2Won(false);
        setPlayerTurn(true);

        List<Button> buttons = new ArrayList<>();
        buttons.add(board.button1);
        buttons.add(board.button2);
        buttons.add(board.button3);
        buttons.add(board.button4);
        buttons.add(board.button5);
        buttons.add(board.button6);
        buttons.add(board.button7);
        buttons.add(board.button8);
        buttons.add(board.button9);
        for(Button b : buttons){
            b.setDisable(false);
        }
    }

    // Getters and Setters
    private static void setPlayerTurn(boolean b) {
        playerTurn = b;
    }

    public static boolean isPlayer1Won() {
        return player1Won;
    }

    public static boolean isPlayer2Won() {
        return player2Won;
    }

    public static void setPlayer1Won(boolean b) {
        player1Won = b;
    }

    public static void setPlayer2Won(boolean b) {
        player2Won = b;
    }
}