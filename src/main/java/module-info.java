module com.company.ejerciciotema3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.ejerciciotema3 to javafx.fxml;
    exports com.company.ejerciciotema3;
}