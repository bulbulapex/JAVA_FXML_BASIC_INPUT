module com.example.st_reg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.st_reg to javafx.fxml;
    exports com.example.st_reg;
}