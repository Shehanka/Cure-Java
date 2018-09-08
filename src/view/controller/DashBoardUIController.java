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
public class DashBoardUIController implements Initializable {

    @FXML
    private AnchorPane rootDash;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void loadBloodFilter(){
        try {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/fxml/BloodFilter.fxml"));
            rootDash.getChildren().setAll(anchorPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
