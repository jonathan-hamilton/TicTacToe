package game.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// Controller for Title page, one button to play tic tac toe
public class TitleController {

    @FXML
    public Button pressToPlayButton = new Button();

    public void pressToPlayButtonAction(ActionEvent e){
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("/game/views/tic_tac_toe.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("Tic Tac Toe");
            stage.show();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
