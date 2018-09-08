package view.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 9/8/2018
 * @project Cure-Java
 **/
public class LoginUIController implements Initializable{

    @FXML
    private AnchorPane rootMainMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void signInClickedAction(){
        try {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/fxml/SignInUI.fxml"));
            rootMainMenu.getChildren().setAll(anchorPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
