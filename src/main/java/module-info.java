module com.example.javafxuvoduvod {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxuvoduvod to javafx.fxml;
    exports com.example.javafxuvoduvod;
}