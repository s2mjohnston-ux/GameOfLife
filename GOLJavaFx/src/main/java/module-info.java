module com.mj.goljavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mj.goljavafx to javafx.fxml;
    exports com.mj.goljavafx;
}