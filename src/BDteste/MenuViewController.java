package BDteste;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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
