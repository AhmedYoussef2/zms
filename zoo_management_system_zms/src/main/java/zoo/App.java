package zoo;


// import java.util.Date;

// import java.io.FileInputStream;
// import java.io.InputStream;

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

    static Stage secondaryStage;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root =FXMLLoader.load(getClass().getResource("logInPage.fxml"));
        // Parent root =FXMLLoader.load(getClass().getResource("search.fxml"));
        Parent root =FXMLLoader.load(getClass().getResource("layouts/logInPage.fxml"));
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("ZOO MANAGEMENT SYSTEM");
        // Image image =new Image("appIcon.png");
        Image image =new Image(getClass().getResourceAsStream("/zoo/images/appIcon.png"));
        // Image image=new Image(getClass().getResourceAsStream("appIcon.jpg"));
        // InputStream stream = new FileInputStream("/zoo/appIcon.jpg");
        // Image image = new Image(stream);
        primaryStage.getIcons().add(image);
        secondaryStage=primaryStage;
    }

    public static void main(String[] args) {
        launch();
        // https://edencoding.com/where-to-put-resource-files-in-javafx/#fxml
    }

}