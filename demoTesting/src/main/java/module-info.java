module com.pterapan.demotesting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pterapan.demotesting to javafx.fxml;
    exports com.pterapan.demotesting;
}