module MavenFXTest {

    requires javafx.fxml;
    requires javafx.controls;

    opens MavenFXTest to javafx.graphics;
    exports MavenFXTest;


}