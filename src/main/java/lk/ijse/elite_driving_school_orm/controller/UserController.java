package lk.ijse.elite_driving_school_orm.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lk.ijse.elite_driving_school_orm.bo.custom.BOFactory;
import lk.ijse.elite_driving_school_orm.bo.custom.UserBO;
import lk.ijse.elite_driving_school_orm.dto.UserDTO;
import lk.ijse.elite_driving_school_orm.dto.tm.UserTM;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    @FXML
    private TableColumn<UserTM, String> colPassword;

    @FXML
    private TableColumn<UserTM, String> colRole;

    @FXML
    private TableColumn<UserTM, String> colUserId;

    @FXML
    private TableColumn<UserTM, String> colUserName;

    @FXML
    private TableView<UserTM> tblUser;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtRole;

    @FXML
    private TextField txtUserId;

    @FXML
    private TextField txtUserName;

    UserBO userBO = (UserBO) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.USER);

    private void showAlert(Alert.AlertType type, String msg) {
        new Alert(type, msg).show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colUserId.setCellValueFactory(new PropertyValueFactory<>("userId"));
        colUserName.setCellValueFactory(new PropertyValueFactory<>("userName"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));

        try {
            loadAllUsers();
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Failed to load users.");
        }
    }

    private void loadAllUsers() {
        List<UserDTO> all = userBO.getAll();
        tblUser.setItems(FXCollections.observableArrayList(
                all.stream().map(dto -> new UserTM(
                        dto.getUserId(),
                        dto.getName(),       // Assuming name is used as 'userName'
                        dto.getPassword(),
                        dto.getUsername()    // Assuming username is the role (for this example)
                )).toList()
        ));
    }

    private void clearFields() {
        txtUserId.clear();
        txtUserName.clear();
        txtPassword.clear();
        txtRole.clear();
        tblUser.getSelectionModel().clearSelection();
    }

    @FXML
    void handleClear(ActionEvent event) {
        clearFields();
    }

    @FXML
    void handleSaveUser(ActionEvent event) {
        if (txtUserId.getText().isEmpty() || txtUserName.getText().isEmpty() ||
                txtPassword.getText().isEmpty() || txtRole.getText().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Please fill all fields!");
            return;
        }

        UserDTO dto = new UserDTO(
                txtUserId.getText(),
                txtRole.getText(),      // username
                txtPassword.getText(),
                txtUserName.getText()   // name
        );

        try {
            boolean isSaved = userBO.save(dto);
            if (isSaved) {
                showAlert(Alert.AlertType.INFORMATION, "User saved successfully!");
                loadAllUsers();
                clearFields();
            } else {
                showAlert(Alert.AlertType.ERROR, "Failed to save user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Exception: " + e.getMessage());
        }
    }

    @FXML
    void handleUpdateUser(ActionEvent event) {
        if (txtUserId.getText().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Please select a user to update.");
            return;
        }

        UserDTO dto = new UserDTO(
                txtUserId.getText(),
                txtRole.getText(),      // username
                txtPassword.getText(),
                txtUserName.getText()   // name
        );

        try {
            boolean isUpdated = userBO.update(dto);
            if (isUpdated) {
                showAlert(Alert.AlertType.INFORMATION, "User updated successfully!");
                loadAllUsers();
                clearFields();
            } else {
                showAlert(Alert.AlertType.ERROR, "Failed to update user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Exception: " + e.getMessage());
        }
    }

    @FXML
    void handleDeleteUser(ActionEvent event) {
        String userId = txtUserId.getText();

        if (userId.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Please select a user to delete.");
            return;
        }

        Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to delete user " + userId + "?");
        Optional<ButtonType> result = confirmation.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            try {
                boolean isDeleted = userBO.delete(Integer.parseInt(userId));
                if (isDeleted) {
                    showAlert(Alert.AlertType.INFORMATION, "User deleted successfully!");
                    loadAllUsers();
                    clearFields();
                } else {
                    showAlert(Alert.AlertType.ERROR, "Failed to delete user.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                showAlert(Alert.AlertType.ERROR, "Exception: " + e.getMessage());
            }
        }
    }

    @FXML
    void tableClickOnAction(MouseEvent event) {
        UserTM selected = tblUser.getSelectionModel().getSelectedItem();
        if (selected != null) {
            txtUserId.setText(selected.getUserId());
            txtUserName.setText(selected.getUsername());
            txtPassword.setText(selected.getPassword());
            txtRole.setText(selected.getRole());
        }
    }
}
