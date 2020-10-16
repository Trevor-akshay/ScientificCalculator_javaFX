/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author User
 */
public class mainCalController implements Initializable {
    
    @FXML
    private TextField number1Field;
    @FXML
    private TextField number2Field;
    @FXML
    private TextField resultField;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleAddAction(ActionEvent event) {
        double num1 = Double.parseDouble(number1Field.getText());
        double num2 = Double.parseDouble(number2Field.getText());
        
        double sum = num1 + num2;
        resultField.setText(sum + "");
        number1Field.setText("");
        number2Field.setText("");
    }

    @FXML
    private void handleMultiAction(ActionEvent event) {
        double num1 = Double.parseDouble(number1Field.getText());
        double num2 = Double.parseDouble(number2Field.getText());
        
        double sum = num1 * num2;
        resultField.setText(sum + "");
        number1Field.setText("");
        number2Field.setText("");
    }

    @FXML
    private void handleDivtiAction(ActionEvent event) {
        double num1 = Double.parseDouble(number1Field.getText());
        double num2 = Double.parseDouble(number2Field.getText());
        
        double sum = num1 / num2;
        resultField.setText(sum + "");
        number1Field.setText("");
        number2Field.setText("");
    }

    @FXML
    private void handleSubtiAction(ActionEvent event) {
        double num1 = Double.parseDouble(number1Field.getText());
        double num2 = Double.parseDouble(number2Field.getText());
        
        double sum = num1 - num2;
        resultField.setText(sum + "");
        number1Field.setText("");
        number2Field.setText("");
    }
    
}
