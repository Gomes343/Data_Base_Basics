package Controller;

import Model.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author a1700677
 */
public class UpdateViewController implements Initializable {
    
    
    @FXML private Label label01;
    @FXML private Label label02;
    @FXML private Label label03;
    @FXML private Label label04;
    @FXML private Label label05;
    @FXML private TextField textField01;
    @FXML private TextField textField02;
    @FXML private TextField textField03;
    @FXML private Button buttonNome;
    @FXML private Button buttonCPF;
    @FXML private Button buttonVoltar;
    @FXML private Button buttonConsultar;
    
    
    @FXML private void UpdateCPF(ActionEvent event) {
        
        Cliente c = new Cliente(textField01.getText(),textField02.getText());
        boolean b = c.verificar();
        
        if(b == false){
            label04.setText("Erro no Preenchimento!");
            textField01.setText("");
            textField02.setText("");
        }else{
            if(c.enviar() == true){
            label04.setText("Cadastro Realizado com Sucesso!");                
            }else{
            label04.setText("Erro no momento de envio para BD");                
            }
        }
    }
    
    @FXML private void UpdateNome(ActionEvent event) {
        
        Cliente c = new Cliente(textField01.getText(),textField02.getText());
        boolean b = c.verificar();
        
        if(b == false){
            label04.setText("Erro no Preenchimento!");
            textField01.setText("");
            textField02.setText("");
        }else{
            if(c.enviar() == true){
            label04.setText("Cadastro Realizado com Sucesso!");                
            }else{
            label04.setText("Erro no momento de envio para BD");                
            }
        }
    }
    
    @FXML private void Voltar(ActionEvent event) throws Exception {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/ViewFXML/menuInicialView.fxml"));
        } catch (IOException ex) {
    
        }
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
