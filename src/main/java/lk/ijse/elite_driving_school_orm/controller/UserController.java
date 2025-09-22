package lk.ijse.elite_driving_school_orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UserController {

    @FXML
    private TableColumn<?, ?> colPassword;

    @FXML
    private TableColumn<?, ?> colRole;

    @FXML
    private TableColumn<?, ?> colUserId;

    @FXML
    private TableColumn<?, ?> colUserName;

    @FXML
    private TableView<?> tblUser;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtRole;

    @FXML
    private TextField txtUserId;

    @FXML
    private TextField txtUserName;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleDeleteUser(ActionEvent event) {

    }

    @FXML
    void handleSaveUser(ActionEvent event) {

    }

    @FXML
    void handleUpdateUser(ActionEvent event) {

    }

    @FXML
    void tableClickOnAction(MouseEvent event) {

    }

}
