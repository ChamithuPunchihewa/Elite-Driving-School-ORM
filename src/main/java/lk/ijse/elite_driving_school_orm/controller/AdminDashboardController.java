package lk.ijse.elite_driving_school_orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AdminDashboardController {

    @FXML
    private Button btnViewAll;

    @FXML
    private TableColumn<?, ?> colActivityAction;

    @FXML
    private TableColumn<?, ?> colActivityDetails;

    @FXML
    private TableColumn<?, ?> colActivityTime;

    @FXML
    private TableColumn<?, ?> colActivityUser;

    @FXML
    private BarChart<?, ?> enrollmentChart;

    @FXML
    private Label lblCurrentDate;

    @FXML
    private Label lblMonthlyRevenue;

    @FXML
    private Label lblTotalCourses;

    @FXML
    private Label lblTotalInstructors;

    @FXML
    private Label lblTotalStudents;

    @FXML
    private Label lblWelcomeUser;

    @FXML
    private MenuItem menuChangePassword;

    @FXML
    private MenuItem menuLogout;

    @FXML
    private MenuItem menuProfile;

    @FXML
    private PieChart paymentChart;

    @FXML
    private TableView<?> tblRecentActivities;

    @FXML
    void changePasswordAction(ActionEvent event) {

    }

    @FXML
    void coursesAction(ActionEvent event) {

    }

    @FXML
    void dashboardAction(ActionEvent event) {

    }

    @FXML
    void instructorsAction(ActionEvent event) {

    }

    @FXML
    void lessonsAction(ActionEvent event) {

    }

    @FXML
    void logoutAction(ActionEvent event) {

    }

    @FXML
    void paymentsAction(ActionEvent event) {

    }

    @FXML
    void profileAction(ActionEvent event) {

    }

    @FXML
    void quickAddInstructorAction(ActionEvent event) {

    }

    @FXML
    void quickAddStudentAction(ActionEvent event) {

    }

    @FXML
    void quickScheduleLessonAction(ActionEvent event) {

    }

    @FXML
    void quickViewReportsAction(ActionEvent event) {

    }

    @FXML
    void reportsAction(ActionEvent event) {

    }

    @FXML
    void studentsAction(ActionEvent event) {

    }

    @FXML
    void usersAction(ActionEvent event) {

    }

    @FXML
    void viewAllActivitiesAction(ActionEvent event) {

    }

}
