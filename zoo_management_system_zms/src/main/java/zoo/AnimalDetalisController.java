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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AnimalDetalisController {
    @FXML
    Label cagenolabel;

    @FXML
    Label namelabel;

    @FXML
    Label infolabel;

    @FXML
    ImageView animalimage;

    @FXML
    Label specielabel;

    public void setAnimalDetails(String srarchArg) {
        if (srarchArg.equals("Lion")) {
            Lion lion = new Lion();
            cagenolabel.setText(Integer.toString(lion.getCageno()));
            namelabel.setText(lion.getName());
            infolabel.setText(lion.getInfo());
            specielabel.setText(lion.getSpecie());
            animalimage.setImage(lion.getAnImage());

        } else if (srarchArg.equals("Giraffe")) {
            Giraffe giraffe = new Giraffe();
            cagenolabel.setText(Integer.toString(giraffe.getCageno()));
            namelabel.setText(giraffe.getName());
            infolabel.setText(giraffe.getInfo());
            specielabel.setText(giraffe.getSpecie());
            animalimage.setImage(giraffe.getAnImage());

        } else if (srarchArg.equals("Monkey")) {
            Monkey monkey = new Monkey();
            cagenolabel.setText(Integer.toString(monkey.getCageno()));
            namelabel.setText(monkey.getName());
            infolabel.setText(monkey.getInfo());
            specielabel.setText(monkey.getSpecie());
            animalimage.setImage(monkey.getAnImage());

        } else if (srarchArg.equals("Tiger")) {
            Tiger tiger = new Tiger();
            cagenolabel.setText(Integer.toString(tiger.getCageno()));
            namelabel.setText(tiger.getName());
            infolabel.setText(tiger.getInfo());
            specielabel.setText(tiger.getSpecie());
            animalimage.setImage(tiger.getAnImage());

        } else if (srarchArg.equals("Zebra")) {
            Zebra zebra = new Zebra();
            cagenolabel.setText(Integer.toString(zebra.getCageno()));
            namelabel.setText(zebra.getName());
            infolabel.setText(zebra.getInfo());
            specielabel.setText(zebra.getSpecie());
            animalimage.setImage(zebra.getAnImage());

        } else {
            Tiger tiger = new Tiger();
            cagenolabel.setText("unknown");
            namelabel.setText("unknown");
            infolabel.setText("This animal will be here soon.");
            specielabel.setText("unknown");
            animalimage.setImage(tiger.getAnImage());
        }
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
}
