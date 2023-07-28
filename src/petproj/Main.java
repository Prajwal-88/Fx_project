package petproj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene scene = new Scene(root);
        Image icon = new Image("/petproj/google-icon.png");
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        
        stage.getIcons().add(icon);
        stage.setTitle("Google Works");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
