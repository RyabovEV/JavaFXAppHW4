package com.example.javafxapphw4;
/**
 * Создать окно для клиентской части чата: большое текстовое поле для отображения переписки
 * в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки
 * сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на
 * форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего
 * поля в центральное.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HW4app extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HW4app.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Chatik!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}