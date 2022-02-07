package com.parkhurst.temperatureconverator;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TempController {
    @FXML
    private Label ansText;
    @FXML
    private CheckBox degrCheckF;
    @FXML
    private CheckBox degrCheckC;
    @FXML
    private TextField ansField;

    /**
     * @param str: String to test if we can convert to Float
     * @return
     */
    protected static float convStrFl(String str){
        try {
            @SuppressWarnings("unused")
            float x = Float.parseFloat(str);
            return x; //String is an Integer
        } catch (NumberFormatException e) {
            return -500; //String is not an Integer
        }

    }
    @FXML
    protected void onConvertClick() {
        //We call TempGenerator
        if(degrCheckF.isSelected() && !degrCheckC.isSelected()){
            float tempVal = Float.parseFloat(ansField.getText());
            tempVal=TempGenerator.cToF(tempVal);
            ansText.setText("The Fahrenheit Temperature is: "+tempVal);
        }else if(degrCheckC.isSelected() && !degrCheckF.isSelected()){
            float tempVal = Float.parseFloat(ansField.getText());
            tempVal=TempGenerator.fToC(tempVal);
            ansText.setText("The Celsius Temperature is: "+tempVal);
        }else{
            ansText.setText("Make sure you select only Celsius or Fahrenheit");
        }

    }
}