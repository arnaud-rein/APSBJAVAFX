module fr.ram {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.sql; 

    opens fr.ram to javafx.fxml;
    exports fr.ram;
}
