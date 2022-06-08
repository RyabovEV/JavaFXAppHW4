module com.example.javafxapphw4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxapphw4 to javafx.fxml;
    exports com.example.javafxapphw4;
}