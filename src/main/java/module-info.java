module com.example.herceg_cvregex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.herceg_cvregex to javafx.fxml;
    exports com.example.herceg_cvregex;
}