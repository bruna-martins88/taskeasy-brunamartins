module mavenproject1.att9_zumbi {
    requires javafx.controls;
    requires javafx.fxml;

    opens mavenproject1.att9_zumbi to javafx.fxml;
    exports mavenproject1.att9_zumbi;
}
