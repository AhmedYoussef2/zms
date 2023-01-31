package zoo;

import java.io.IOException;

// import data.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
// import javafx.stage.Stage;

public class SearchController extends AnimalDetailsController {

    @FXML
    TextField animalNameInput;

    String searchValue;

    @FXML
    private void search() throws IOException {

        if (animalNameInput.getText().equals("Lion")) {

            searchValue = "Lion";
            // return searchValue;
            // System.out.println(1);

        } else if (animalNameInput.getText().equals("Monkey")) {

            searchValue="Monkey";
            // return  searchValue;
            // System.out.println(2);


        } else if (animalNameInput.getText().equals("Giraffe")) {

            searchValue="Giraffe";
            // return searchValue;
            // System.out.println(3);



        } else if (animalNameInput.getText().equals("Tiger")) {

            searchValue="Tiger";
            // return searchValue;
            // System.out.println(4);


        }else if (animalNameInput.getText().equals("Zebra")) {
            
            searchValue="Zebra";
            // return searchValue;
            // System.out.println(5);


        }
         else {

            // return "not found";
            // System.out.println(6);
            searchValue="unknown";


        }

    }



    @FXML
    private void switchToAnimal(ActionEvent event) throws IOException {

        search();

        // FXMLLoader loader = new FXMLLoader(getClass().getResource("animalDetails.fxml"));
        // Parent root = loader.load();
        // AnimalDetalisController animalDetalisController = loader.getController();
        // animalDetalisController.setAnimalDetails(searchValue);

        // Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader animalDetailsFxmlLoader= new FXMLLoader(App.class.getResource("animalDetails.fxml"));
        Parent animalDetailsParent = animalDetailsFxmlLoader.load();
        AnimalDetailsController animalDetailsController = animalDetailsFxmlLoader.getController();
        animalDetailsController.setAnimalDetails(searchValue);
        Scene animalDetailsScene = new Scene(animalDetailsParent);
        App.secondaryStage.setScene(animalDetailsScene); 

    }

    @FXML
    private void switchToSearch(ActionEvent event) throws IOException {
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("search.fxml"));
        // Parent root = loader.load();

        // Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader searchFxmlLoader= new FXMLLoader(App.class.getResource("search.fxml"));
        Parent searchParent = searchFxmlLoader.load();
        Scene searchScene = new Scene(searchParent);
        App.secondaryStage.setScene(searchScene);
    }

    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {

        // FXMLLoader loader = new FXMLLoader(getClass().getResource("homePage.fxml"));
        // Parent root = loader.load();

        // Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader homePageFxmlLoader= new FXMLLoader(App.class.getResource("homePage.fxml"));
        Parent homePageParent = homePageFxmlLoader.load();
        Scene homePageScene = new Scene(homePageParent);
        App.secondaryStage.setScene(homePageScene);

    }

    @FXML
    private void switchToTickets(ActionEvent event) throws IOException {
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("tickets.fxml"));
        // Parent root = loader.load();

        // Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader ticketsFxmlLoader= new FXMLLoader(App.class.getResource("tickets.fxml"));
        Parent ticketsParent = ticketsFxmlLoader.load();
        Scene ticketsScene = new Scene(ticketsParent);
        App.secondaryStage.setScene(ticketsScene);
        TicketsController dateObject=new TicketsController();
        dateObject.setDate();

    }

    @FXML
    private void switchToLogInPage(ActionEvent event) throws IOException {

        // FXMLLoader loader = new FXMLLoader(getClass().getResource("logInPage.fxml"));
        // Parent root = loader.load();

        // Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader logInPageFxmlLoader= new FXMLLoader(App.class.getResource("logInPage.fxml"));
        Parent logInPageParent = logInPageFxmlLoader.load();
        Scene logInPageScene = new Scene(logInPageParent);
        App.secondaryStage.setScene(logInPageScene); 

    }

    @FXML
    Label userNameLabel;

    public void welcomeUser(String userName) {
        userNameLabel.setText(userName);
    }

}