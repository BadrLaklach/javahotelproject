package com.example.administrator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label addPromoCode;

    @FXML
    private Button addPromoCodeButton;

    @FXML
    private Button addRoomButton;

    @FXML
    private Label addRoomLabel;



    @FXML
    private Label chooseRoomTypeLabel;

    @FXML
    private Label chooseServicesLabel;

    @FXML
    private Label roomNumberLabel;

    @FXML
    private Label roomNumberLabel1;
    @FXML
    private Label discountLabel;


    /*these are the head buttons*/
    @FXML
    private Button bookingsButton;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button guestsButton;

    @FXML
    private Button revenueButton;

    @FXML
    private Button roomsButton;



    public void rooms_to_dashboard() throws IOException {
        Stage stage = (Stage) dashboardButton.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setTitle("DashBoard");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin5.fxml"));
        stage1.setScene(new Scene(fxmlLoader.load(), 1200, 700));
        stage1.show();
    }

    public void rooms_to_revenues() throws IOException {
        Stage stage = (Stage) revenueButton.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setTitle("Revenues");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin4.fxml"));
        stage1.setScene(new Scene(fxmlLoader.load(), 1200, 700));
        stage1.show();
    }

    public void rooms_to_guests() throws IOException {
        Stage stage = (Stage) guestsButton.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setTitle("Guests");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin2.fxml"));
        stage1.setScene(new Scene(fxmlLoader.load(), 1200, 700));
        stage1.show();
    }

    public void rooms_to_bookings() throws IOException {
        Stage stage = (Stage) bookingsButton.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setTitle("Bookings");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin3.fxml"));
        stage1.setScene(new Scene(fxmlLoader.load(), 1200, 700));
        stage1.show();
    }
    public void rooms_to_addRoom() throws IOException {
        Stage stage = (Stage) roomsButton.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setTitle("Rooms");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin1.fxml"));
        stage1.setScene(new Scene(fxmlLoader.load(), 1200, 700));
        stage1.show();
    }

}