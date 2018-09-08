package view.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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
public class SignInUIController implements Initializable {

    @FXML
    private AnchorPane rootSignIn;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void verifyLogin(){
        String userName = "chamod";
        String password = "123";

        if (txtUserName.getText().equals(userName)){
            System.out.println("Login Success");
            try {
                AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/fxml/DashBoardUI.fxml"));
                rootSignIn.getChildren().setAll(anchorPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("Failed");
        }

    }
}
