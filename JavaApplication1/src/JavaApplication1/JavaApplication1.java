
package JavaApplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class JavaApplication1 extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Label label = new Label("hello world");
        //label.setAlignment(Pos.CENTER);
       
        primaryStage.setTitle("hello world Application");
        Button btn = new Button("click me");
        btn.setMinSize(200, 200);
         primaryStage.setScene(new Scene(btn,300,250));
        primaryStage.show();
    }

public static void main(String[] args)
{
    launch(args);

}
}