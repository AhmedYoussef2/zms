package zoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        Scene scene=new Scene(root,680,400);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("ZOO MANAGEMENT SYSTEM");
        Image image =new Image("app.png");
        stage.getIcons().add(image);
    }

    public static void main(String[] args) {
        launch();
    }

}