package com.example.herceg_cvregex;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegController {
    @FXML
    private Label checkLabel;
    @FXML
    private TextArea regexTA;
    @FXML
    private TextField expTF;

    @FXML
    protected void checkBut() {
        String regex = regexTA.getText();
        String value = expTF.getText();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        boolean matchFound = matcher.find();
        if(matchFound){
            checkLabel.setText("OK");
        }
        else{
            checkLabel.setText("NG");
        }
    }
}