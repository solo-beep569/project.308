module com.example.hitman {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hitman to javafx.fxml;
    exports com.example.hitman;
}