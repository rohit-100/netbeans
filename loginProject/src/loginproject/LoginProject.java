/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginproject;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rohit
 */
public class LoginProject extends Application{
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent loader = FXMLLoader.load(getClass().getResource("login.fxml"));
       primaryStage.setScene(new Scene(loader,400,300));
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
      //dbHandler.fun();
    }
    
}
