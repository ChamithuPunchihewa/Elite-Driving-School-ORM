package lk.ijse.elite_driving_school_orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CoursePageController {

    @FXML
    private TableColumn<?, ?> colCourseId;

    @FXML
    private TableColumn<?, ?> colDuration;

    @FXML
    private TableColumn<?, ?> colFee;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableView<?> tblCourse;

    @FXML
    private TextField txtCourseId;

    @FXML
    private TextField txtDuration;

    @FXML
    private TextField txtFee;

    @FXML
    private TextField txtName;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleDeleteCourse(ActionEvent event) {

    }

    @FXML
    void handleSaveCourse(ActionEvent event) {

    }

    @FXML
    void handleUpdateCourse(ActionEvent event) {

    }

    @FXML
    void tableClickOnAction(MouseEvent event) {

    }

}
