module giang {
    requires javafx.controls;
    requires javafx.fxml;

    opens giang to javafx.fxml;
    exports giang;
}
