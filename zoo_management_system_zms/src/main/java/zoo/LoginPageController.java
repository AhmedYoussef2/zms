package zoo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage; 

public class LogInPageController {
    // @FXML
    // TextField username;

    // @FXML
    // PasswordField password;

    // @FXML
    // private void switchToHomePage(ActionEvent event) throws IOException {
        
    //     String welcome =username.getText();
        
    //     FXMLLoader loader=new FXMLLoader(getClass().getResource("homePage.fxml"));
    //     Parent root=loader.load();

    //     Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    //     Scene scene=new Scene(root);
    //     stage.setScene(scene);
    //     stage.show();
        
    //     HomePageController homePageController=loader.getController();
    //     homePageController.welcomeUser("hello "+ welcome);

    // }
    // @FXML
    // private void switchToSecondary() throws IOException {
    //     // System.out.println(textfield.getText());
    //     // fun();
    //     // if (textField.getText().equals(rone)) {
    //     //     FXMLLoader fxmlLoader2 = new FXMLLoader(App.class.getResource("secondary.fxml"));
    //     //     Parent parent2 = fxmlLoader2.load();
    //     //     Scene scene2 = new Scene(parent2, 500, 500);
    //     //     App.fin.setScene(scene2);
    //     // } else {
    //     //     FXMLLoader fxmlLoader2 = new FXMLLoader(App.class.getResource("test.fxml"));
    //     //     Parent parent2 = fxmlLoader2.load();
    //     //     Scene scene2 = new Scene(parent2, 300, 300);
    //     //     Stage stage=new Stage();
    //     //     stage.setScene(scene2);
    //     //     stage.show();
    //     // }
    //     FXMLLoader fxmlLoader2 = new FXMLLoader(App.class.getResource("secondary.fxml"));
    //     Parent parent2 = fxmlLoader2.load();
    //     Scene scene2 = new Scene(parent2);
    //     App.fin.setScene(scene2);
    //     // App.fin.show();
    //     // Stage stage2=new Stage();
    //     // stage2.setScene(scene2);
    //     // stage2.show();
    //     // App.scene1.setRoot(parent2);
    
    // }

    @FXML
    TextField userNameInput;
    
    @FXML
    PasswordField passwordInput;

    UserClass initUser=new UserClass();
    UserClass user1=new UserClass();
    UserClass user2=new UserClass();
    // UserClass user3=new UserClass();

    int v=1;

    @FXML
    private void signUp(ActionEvent event)throws IOException{
          
        if (v==1) {
            user1.username=userNameInput.getText();
            user1.password=passwordInput.getText();  
            v=2;
            
        }
       else if (v==2) {
            user2.username=userNameInput.getText();
            user2.password=passwordInput.getText();
       }
       else{

            FXMLLoader fxmlLoader2 = new FXMLLoader(App.class.getResource("exception.fxml"));
            Parent parent2 = fxmlLoader2.load();
            Scene scene2 = new Scene(parent2);
            Stage stage=new Stage();
            stage.setScene(scene2);
            stage.show();
       }
    }

    @FXML
    private void signIn(ActionEvent event)throws IOException{
        // String userName =userNameInput.getText();
        
        // if (userNameInput.getText().equals(initUser.username)||userNameInput.getText().equals(user1.username)||userNameInput.getText().equals(user2.username)) {
        //     if (passwordInput.getText().equals(initUser.password)||passwordInput.getText().equals(user1.password)||passwordInput.getText().equals(user2.password)) {
                FXMLLoader homePageFxmlLoader = new FXMLLoader(App.class.getResource("homePage.fxml"));
                Parent homePageParent = homePageFxmlLoader.load();
                Scene homePageScene = new Scene(homePageParent);
                App.secondaryStage.setScene( homePageScene);
                // HomePageController homePageController=homePageFxmlLoader.getController();
                // homePageController.greetingUser(userName);
        //     }
        //     else{
        //     FXMLLoader errorFxmlLoader = new FXMLLoader(App.class.getResource("exception.fxml"));
        //     Parent errorParent = errorFxmlLoader.load();
        //     Scene errorScene = new Scene(errorParent);
        //     Stage stage=new Stage();
        //     stage.setScene(errorScene);
        //     stage.show();
        //     }
        // }
        // else{
        //     FXMLLoader errorFxmlLoader = new FXMLLoader(App.class.getResource("exception.fxml"));
        //     Parent errorParent = errorFxmlLoader.load();
        //     Scene errorScene = new Scene(errorParent);
        //     Stage stage=new Stage();
        //     stage.setScene(errorScene);
        //     stage.show();
        // }
    }
  
}


/**
 * UserClass
 */
 class UserClass {
     String username="Ahmed";
     String password="123456";
}
    



