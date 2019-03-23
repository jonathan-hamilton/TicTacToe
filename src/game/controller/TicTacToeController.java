package game.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static game.service.TicTacToeService.*;

// Controller for the Tic Tac Toe game
public class TicTacToeController implements EventHandler<ActionEvent> {

    // One button for each position on the tic tac toe board, plus a reset button
    @FXML
    public Button reset;
    @FXML
    public Button button1 = new Button();
    @FXML
    public Button button2 = new Button();
    @FXML
    public Button button3 = new Button();
    @FXML
    public Button button4 = new Button();
    @FXML
    public Button button5 = new Button();
    @FXML
    public Button button6 = new Button();
    @FXML
    public Button button7 = new Button();
    @FXML
    public Button button8 = new Button();
    @FXML
    public Button button9 = new Button();
    @FXML
    public Label winnerLabel = new Label();

//    TicTacToeModel board = new TicTacToeModel();

    // Required override not used in this implementation
    @Override
    public void handle(ActionEvent event) {
        
    }

    // On click ActionEvent on each button, passing the button and the instance of the tic tac toe board to a
    // service class method that sets the text, checks for a win and switches players turns
    public void button1ActionPerformed(ActionEvent e){
        if(button1.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button1, this);
        }
    }

    public void button2ActionPerformed(ActionEvent e) {
        if(button2.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button2, this);
        }
    }

    public void button3ActionPerformed(ActionEvent e) {
        if(button3.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button3, this);
        }
    }

    public void button4ActionPerformed(ActionEvent e) {
        if(button4.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button4, this);
        }
    }

    public void button5ActionPerformed(ActionEvent e) {
        if(button5.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button5, this);
        }
    }

    public void button6ActionPerformed(ActionEvent e) {
        if(button6.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button6, this);
        }
    }

    public void button7ActionPerformed(ActionEvent e) {
        if(button7.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button7, this);
        }
    }

    public void button8ActionPerformed(ActionEvent e) {
        if(button8.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button8, this);
        }
    }

    public void button9ActionPerformed(ActionEvent e) {
        if(button9.getText().equals("")){
            setTextCheckForWinAndSwitchPlayerTurn(button9, this);
        }
    }

    // Reset button to clear values and start a new game
    public void resetActionPerformed(ActionEvent e) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        winnerLabel.setText("");
        playerTurn = true;
        player1Won = false;
        player2Won = false;
    }
}
