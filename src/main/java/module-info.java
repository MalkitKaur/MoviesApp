module com.example.moviesapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens com.example.moviesapp to javafx.fxml;
    exports com.example.moviesapp;
}