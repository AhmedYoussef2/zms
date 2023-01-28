package zoo;

import java.io.IOException;

import data.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
// import javafx.stage.Stage;

public class AnimalDetalisController {
    @FXML
    Label cageNumLabel;

    @FXML
    Label nameLabel;

    @FXML
    Label specieLabel;

    @FXML
    ImageView animalImage;

    @FXML
    Label  descriptionLabel;

    public void setAnimalDetails(String srarchArg) {
        if (srarchArg.equals("Lion")) {
            Lion lion = new Lion();
            cageNumLabel.setText(Integer.toString(lion.getCageNo()));
            nameLabel.setText(lion.getName());
            descriptionLabel.setText(lion.getInfo());
            specieLabel.setText(lion.getSpecie());
            animalImage.setImage(lion.getAnImage());

        } else if (srarchArg.equals("Giraffe")) {
            Giraffe giraffe = new Giraffe();
            cageNumLabel.setText(Integer.toString(giraffe.getCageNo()));
            nameLabel.setText(giraffe.getName());
            descriptionLabel.setText(giraffe.getInfo());
            specieLabel.setText(giraffe.getSpecie());
            animalImage.setImage(giraffe.getAnImage());

        } else if (srarchArg.equals("Monkey")) {
            Monkey monkey = new Monkey();
            cageNumLabel.setText(Integer.toString(monkey.getCageNo()));
            nameLabel.setText(monkey.getName());
            descriptionLabel.setText(monkey.getInfo());
            specieLabel.setText(monkey.getSpecie());
            animalImage.setImage(monkey.getAnImage());

        } else if (srarchArg.equals("Tiger")) {
            Tiger tiger = new Tiger();
            cageNumLabel.setText(Integer.toString(tiger.getCageNo()));
            nameLabel.setText(tiger.getName());
            descriptionLabel.setText(tiger.getInfo());
            specieLabel.setText(tiger.getSpecie());
            animalImage.setImage(tiger.getAnImage());

        } else if (srarchArg.equals("Zebra")) {
            Zebra zebra = new Zebra();
            cageNumLabel.setText(Integer.toString(zebra.getCageNo()));
            nameLabel.setText(zebra.getName());
            descriptionLabel.setText(zebra.getInfo());
            specieLabel.setText(zebra.getSpecie());
            animalImage.setImage(zebra.getAnImage());

        } else { 
            Tiger tiger = new Tiger();
            cageNumLabel.setText("unknown");
            nameLabel.setText("unknown");
            descriptionLabel.setText("This animal will be here soon.");
            specieLabel.setText("unknown");
            animalImage.setImage(tiger.getAnImage());
        }
    }

    @FXML
    private void switchToSearch(ActionEvent event) throws IOException {
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("search.fxml"));
        // Parent root = loader.load();

        // Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader searchFxmlLoader= new FXMLLoader(App.class.getResource("sreach.fxml"));
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
    private void switchToIickets(ActionEvent event) throws IOException {
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

    }

    @FXML
    private void switchToLoginPage(ActionEvent event) throws IOException {

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
}
