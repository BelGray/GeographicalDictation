module pro.belgray.school2122.geographical_dictation {
    requires javafx.controls;
    requires javafx.fxml;


    opens pro.belgray.school2122.geographical_dictation to javafx.fxml;
    exports pro.belgray.school2122.geographical_dictation;
}