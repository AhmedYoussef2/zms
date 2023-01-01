package zoo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage; 

public class LoginPageController {
    @FXML
    TextField username;

    @FXML
    PasswordField password;

    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {
        
        String wellcome =username.getText();
        
        FXMLLoader loader=new FXMLLoader(getClass().getResource("homePage.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();
        
        HomePageController homePageController=loader.getController();
        homePageController.welcomeuser("hello "+ wellcome);

    }
    
    


}
