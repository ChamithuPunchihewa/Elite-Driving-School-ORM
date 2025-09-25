module lk.ijse.elite_driving_school_orm {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;


    opens lk.ijse.elite_driving_school_orm to javafx.fxml;
    exports lk.ijse.elite_driving_school_orm;
}