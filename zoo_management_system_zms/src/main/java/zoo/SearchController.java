package zoo;

import logic.*;
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

public class SearchController extends AnimalDetalisController {

    @FXML
    TextField searchfield;

    String searchValue;

    
    private void search() {

        if (searchfield.getText().equals("Lion")) {

            searchValue = "Lion";
            // return searchValue;
            // System.out.println(1);

        } else if (searchfield.getText().equals("Monkey")) {

            searchValue="Monkey";
            // return  searchValue;
            // System.out.println(2);


        } else if (searchfield.getText().equals("Giraffe")) {

            searchValue="Giraffe";
            // return searchValue;
            // System.out.println(3);



        } else if (searchfield.getText().equals("Tiger")) {

            searchValue="Tiger";
            // return searchValue;
            // System.out.println(4);


        }else if (searchfield.getText().equals("Zebra")) {
            
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

        FXMLLoader loader = new FXMLLoader(getClass().getResource("animalDetails.fxml"));
        Parent root = loader.load();

        AnimalDetalisController animalDetalisController = loader.getController();
        animalDetalisController.setAnimalDetails(searchValue);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void switchToSearch(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("search.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("homePage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void switchToIickets(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tickets.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void switchToLoginPage(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginPage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 680, 400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    Label usersearch;

    public void welcomeuser(String wellcome) {
        usersearch.setText(wellcome);
    }

}