package game.service;

import game.controller.TicTacToeController;
import javafx.scene.control.Button;

public class TicTacToeService {

    // class variables to keep track of who has won and whose turn it is
    public static boolean playerTurn = true;
    public static boolean player1Won = false;
    public static boolean player2Won = false;

    // checkForWin method to check all possibilities of winning tic tac toe
    public static void checkForWin(TicTacToeController board) {

        // checks for X winning
        if(board.button1.getText().equals("X")) {
            if(board.button4.getText().equals("X")) {
                if(board.button7.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button1.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button9.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button1.getText().equals("X")) {
            if(board.button2.getText().equals("X")) {
                if(board.button3.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button1.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button7.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button1.getText().equals("X")) {
            if(board.button6.getText().equals("X")) {
                if(board.button9.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button7.getText().equals("X")) {
            if(board.button8.getText().equals("X")) {
                if(board.button9.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button4.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button6.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button2.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button8.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button3.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button7.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button7.getText().equals("X")) {
            if(board.button5.getText().equals("X")) {
                if(board.button3.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }
        if(board.button3.getText().equals("X")) {
            if(board.button6.getText().equals("X")) {
                if(board.button9.getText().equals("X")) {
                    player1Won = true;
                    player2Won = false;
                }
            }
        }

        // checks for O winning
        if(board.button1.getText().equals("O")) {
            if(board.button4.getText().equals("O")) {
                if(board.button7.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button1.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button9.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button1.getText().equals("O")) {
            if(board.button2.getText().equals("O")) {
                if(board.button3.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button1.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button7.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button1.getText().equals("O")) {
            if(board.button6.getText().equals("O")) {
                if(board.button9.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button7.getText().equals("O")) {
            if(board.button8.getText().equals("O")) {
                if(board.button9.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button4.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button6.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button2.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button8.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button3.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button7.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button7.getText().equals("O")) {
            if(board.button5.getText().equals("O")) {
                if(board.button3.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
        if(board.button3.getText().equals("O")) {
            if(board.button6.getText().equals("O")) {
                if(board.button9.getText().equals("O")) {
                    player1Won = false;
                    player2Won = true;
                }
            }
        }
    }

    // Method called from Controller class to set text, check for win and switch turns
    public static void setTextCheckForWinAndSwitchPlayerTurn(Button button, TicTacToeController board){
        if(playerTurn){
            button.setText("X");
            checkForWin(board);
            if(player1Won){
                board.winnerLabel.setText("Player 1 Won!!");
            }
            playerTurn = false;
        }else{
            button.setText("O");
            checkForWin(board);
            if(player2Won){
                board.winnerLabel.setText("Player 2 Won!!");
            }
            playerTurn = true;
        }

    }
}
