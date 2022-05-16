module com.example.server_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.server_1 to javafx.fxml;
    exports com.example.server_1;
}