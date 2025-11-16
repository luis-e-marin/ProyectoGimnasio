module uniquindio.edu.co.model.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens uniquindio.edu.co.model.javafx to javafx.fxml;
    exports uniquindio.edu.co.model.javafx;
}