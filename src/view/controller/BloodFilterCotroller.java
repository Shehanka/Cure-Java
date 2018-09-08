package view.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 9/8/2018
 * @project Cure-Java
 **/
public class BloodFilterCotroller implements Initializable {

    @FXML
    private JFXComboBox<String> cbxBloodType;

    @FXML
    private ImageView imgDonators;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbxBloodType.getItems().addAll("A+","A-","B+","B-","O+","O-","AB+","AB-");
        imgDonators.setVisible(false);
    }

    @FXML
    private void setCbxBloodType(){
        if (cbxBloodType.getValue().equals("AB+")){
            imgDonators.setVisible(true);
        }else {
            imgDonators.setVisible(false);
        }
    }
}
