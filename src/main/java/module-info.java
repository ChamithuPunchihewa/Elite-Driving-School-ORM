module lk.ijse.elite_driving_school_orm {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;


    opens lk.ijse.elite_driving_school_orm to javafx.fxml;
    exports lk.ijse.elite_driving_school_orm;
}