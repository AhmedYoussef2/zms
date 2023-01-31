package zoo;

import java.io.IOException;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TicketsController {

    @FXML
    Label adultTotal;
    
    @FXML
    Label childTotal;

    @FXML
    Label chiTickPriceLabel;

    @FXML
    Label aduTickPriceLabel;
     
    @FXML
    Label finalTotal;
   
    @FXML
    TextField aduNumOfTickInput;

    @FXML
    TextField chilNumOfTickeInput;

    @FXML
    Label dateLable;
    
    
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
   @FXML
    private void switchToSearch(ActionEvent event) throws IOException {
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
    }
    
   
    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {
   
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
        setDate();

    }

    public void setDate(){
        Date date=new Date();  
        String dateOutput=date.toString();
        dateLable.setText(dateOutput);
       }
    
    Integer initAduNumOfTickets=0;
    Integer initChiNumOfTickets=0;
  

    @FXML
    public void aduNumOfTickIncreaseMethod(){
        initAduNumOfTickets=initAduNumOfTickets+1;
        // String numOfTickInecrease=""+initNumOfTickInecrease;
        aduNumOfTickInput.setText(initAduNumOfTickets.toString());
        adultTotal.setText(initAduNumOfTickets.toString());
        Integer priceTimesNumOfTickets=initAduNumOfTickets*120;
        Integer biTotal=priceTimesNumOfTickets+(initChiNumOfTickets*60);
        adultTotal.setText(priceTimesNumOfTickets.toString());
        finalTotal.setText(biTotal.toString());
    }
    
    @FXML
    public void chilNumOfTickIncreaseMethod(){
        initChiNumOfTickets=initChiNumOfTickets+1;
        // String numOfTickInecrease=""+initNumOfTickInecrease;
        chilNumOfTickeInput.setText(initChiNumOfTickets.toString());
        Integer priceTimesNumOfTickets=initAduNumOfTickets*60;
        childTotal.setText(priceTimesNumOfTickets.toString());
        Integer biTotal=priceTimesNumOfTickets+(initAduNumOfTickets*120);
        finalTotal.setText(biTotal.toString());
    }

    @FXML
    public void aduNumOfTickDecreaseMethod(){
        initAduNumOfTickets=initAduNumOfTickets-1;
        // String numOfTickInecrease=""+initNumOfTickInecrease;
        aduNumOfTickInput.setText(initAduNumOfTickets.toString());
        Integer priceTimesNumOfTickets=initAduNumOfTickets*120;
        adultTotal.setText(priceTimesNumOfTickets.toString());
        Integer biTotal=priceTimesNumOfTickets+(initChiNumOfTickets*60);
        finalTotal.setText(biTotal.toString());
    }

    @FXML
    public void chilNumOfTickDecreaseMethod(){
        initChiNumOfTickets=initChiNumOfTickets-1;
        // String numOfTickInecrease=""+initNumOfTickInecrease;
        chilNumOfTickeInput.setText(initChiNumOfTickets.toString());
        Integer priceTimesNumOfTickets=initAduNumOfTickets*60;
        childTotal.setText(priceTimesNumOfTickets.toString());
        Integer biTotal=priceTimesNumOfTickets+(initAduNumOfTickets*120);
        finalTotal.setText(biTotal.toString());
    }

}
