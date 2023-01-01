package zoo;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HomePageController  {
   
    @FXML
    Label user;

    

    @FXML
    private void switchToSearch(ActionEvent event) throws IOException {
        
        String wellcome =user.getText();

        FXMLLoader loader=new FXMLLoader(getClass().getResource("search.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();

        
        SearchController searchController =loader.getController();
        searchController.welcomeuser(wellcome);
    }
    
   
    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {
   
        FXMLLoader loader=new FXMLLoader(getClass().getResource("homePage.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void switchToIickets(ActionEvent event) throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("tickets.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void switchToLoginPage(ActionEvent event) throws IOException {
    
        FXMLLoader loader=new FXMLLoader(getClass().getResource("loginPage.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,680,400);
        stage.setScene(scene);
        stage.show();

   }


   public void welcomeuser(String wellcome){
    user.setText(wellcome);
   }
    
}
