package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Alert;

public class loginpagecontroller extends Connector implements Initializable {
    @FXML
    TextField username;

    @FXML
    TextField password;

    @FXML
    Button log;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void loginButtonAction() throws IOException {
        if(username.getText().equals("admin") && password.getText().equals("admin")){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/Menu.fxml"));
            Stage stage = (Stage) log.getScene().getWindow();
            stage.setScene(new Scene(root));
        }
        else{
            username.setText("");
            password.setText("");
            new Alert(Alert.AlertType.ERROR, "Wrong Username or Password").showAndWait();
        }
    }
}
