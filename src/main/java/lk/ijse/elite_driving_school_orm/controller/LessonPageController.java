package lk.ijse.elite_driving_school_orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LessonPageController {

    @FXML
    private TableColumn<?, ?> colCourseId;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colInstructorId;

    @FXML
    private TableColumn<?, ?> colLessonId;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colStudentId;

    @FXML
    private TableColumn<?, ?> colTime;

    @FXML
    private DatePicker dpDate;

    @FXML
    private TableView<?> tblLesson;

    @FXML
    private TextField txtCourseId;

    @FXML
    private TextField txtInstructorId;

    @FXML
    private TextField txtLessonId;

    @FXML
    private TextField txtStatus;

    @FXML
    private TextField txtStudentId;

    @FXML
    private TextField txtTime;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleDeleteLesson(ActionEvent event) {

    }

    @FXML
    void handleSaveLesson(ActionEvent event) {

    }

    @FXML
    void handleUpdateLesson(ActionEvent event) {

    }

    @FXML
    void tableClickOnAction(MouseEvent event) {

    }

}
