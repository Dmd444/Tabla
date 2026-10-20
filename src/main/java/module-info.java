module com.dmd.tabla {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dmd.tabla to javafx.fxml;
    exports com.dmd.tabla;
}
