module com.example.multilingualfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multilingualfx to javafx.fxml;
    exports com.example.multilingualfx;
}