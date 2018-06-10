package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main-view.fxml"));

        Scene scene = new Scene(root);

        stage.getIcons()
                .add(new Image(App.class.getResourceAsStream("../images/favorite-selected.png")));
        stage.sizeToScene();
        stage.setTitle("Fortuna");
        stage.setScene(scene);
        stage.show();
    }

}
