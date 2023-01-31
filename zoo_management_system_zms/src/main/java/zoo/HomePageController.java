package zoo;

import java.io.IOException;
// import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.stage.Stage;

public class HomePageController  {
    // @FXML
    // Label user;

    @FXML
    Label userNameLabel;

    @FXML
    private void switchToSearch(ActionEvent event) throws IOException {
        
        // String userName =userNameLabel.getText();

        // FXMLLoader loader=new FXMLLoader(getClass().getResource("search.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();
        FXMLLoader searchFxmlLoader= new FXMLLoader(App.class.getResource("layouts/search.fxml"));
        Parent searchParent = searchFxmlLoader.load();
        Scene searchScene = new Scene(searchParent);
        App.secondaryStage.setScene(searchScene);
        SearchController searchController=searchFxmlLoader.getController();
        searchController.greetingUser(LogInPageController.userName);

        
        // SearchController searchController =searchFxmlLoader.getController();
        // searchController.welcomeUser(userName);
    }
   
    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {
        // String userName =userNameLabel.getText();
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("homePage.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();
        FXMLLoader homePageFxmlLoader= new FXMLLoader(App.class.getResource("layouts/homePage.fxml"));
        Parent homePageParent = homePageFxmlLoader.load();
        Scene homePageScene = new Scene(homePageParent);
        App.secondaryStage.setScene(homePageScene);
        HomePageController homePageController=homePageFxmlLoader.getController();
        homePageController.greetingUser(LogInPageController.userName);
       
        

    }

    @FXML
    private void switchToTickets(ActionEvent event) throws IOException {
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("tickets.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader ticketsFxmlLoader= new FXMLLoader(App.class.getResource("layouts/tickets.fxml"));
        Parent ticketsParent = ticketsFxmlLoader.load();
        Scene ticketsScene = new Scene(ticketsParent);
        App.secondaryStage.setScene(ticketsScene);
        TicketsController ticketsController=ticketsFxmlLoader.getController();
        ticketsController.setDate();

    }

    @FXML
    private void switchToLogInPage(ActionEvent event) throws IOException {
    
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("logInPage.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader logInPageFxmlLoader= new FXMLLoader(App.class.getResource("layouts/logInPage.fxml"));
        Parent logInPageParent = logInPageFxmlLoader.load();
        Scene logInPageScene = new Scene(logInPageParent);
        App.secondaryStage.setScene(logInPageScene);        

   }
String transUserName;
   public void greetingUser(String userName){
    userNameLabel.setText("Hello, "+userName);
    transUserName=userName;
   }

   
    
}
