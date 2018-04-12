/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDteste;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author a1700677
 */
public class MenuViewController implements Initializable {
    
    @FXML
    private Label label01;
    private Label label02;
    private Label label03;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label01.setText("100");

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
