/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginproject;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rohit
 */
public class FXMLController {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField username, password,name,pass;

   // @FXML
   // private Button loginbtn, signupbtn;
    Stage primaryStage = new Stage();
    

    public void loginfunc(ActionEvent event) {

        if (dbHandler.login(username.getText(), password.getText())) {
            System.out.println("succesfull");
        } else {
            System.out.println("not successful");
        }
       // dbHandler.print(username.getText(), password.getText());

    }
    public void signupfunc(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        primaryStage.setScene(new Scene(root,300,500));
        primaryStage.show();
       
        
    }
    public void signupmain(ActionEvent event)
    {
        if(dbHandler.signup(name.getText(), pass.getText()))
            System.out.println("successful");
        else
            System.out.println("failed");
         Platform.exit();
    }

}
