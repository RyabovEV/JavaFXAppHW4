package com.example.javafxapphw4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    private Chatik chatik;
    @FXML
    private TextField messageInput;
    @FXML
    private TextArea messageHistory;

    public Controller() {
        this.chatik = new Chatik();
    }

    public void clickButtonPush(ActionEvent actionEvent) {
        final String massege = messageInput.getText();
        if (massege.isBlank()) return;
        chatik.addList(massege);
        //messageHistory.appendText(massege + '\n');
        messageInput.clear();
        messageHistory.clear();
        messageHistory.appendText(chatik.toString());
        messageInput.requestFocus();

    }
}