module com.minh.it92_ca2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.minh.it92_ca2 to javafx.fxml;
    exports com.minh.it92_ca2;
}
