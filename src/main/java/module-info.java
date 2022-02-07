module com.parkhurst.temperatureconverator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.parkhurst.temperatureconverator to javafx.fxml;
    exports com.parkhurst.temperatureconverator;
}