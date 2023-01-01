module zoo {
    requires javafx.controls;
    requires javafx.fxml;

    opens zoo to javafx.fxml;
    exports zoo;
}
