package petproj;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button proceedBtn;

    @FXML
    private Label label;

    @FXML
    private Menu menu;

    private Stage stage;
    private Parent root;
    private Scene scene;

    public void SignUpChange(ActionEvent ae) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage = (Stage)((Node)ae.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    
}
