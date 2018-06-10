package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

public class AppController {
    private static int numGames;

    @FXML private Label gameTitle;
    @FXML private Label gamePath;
    @FXML private ImageView starIcon;

    private boolean favorite = false;
    private static Image yellowStar = new Image(AppController.class.getResourceAsStream("../images/favorite-selected.png"));
    private static Image blankStar = new Image(AppController.class.getResourceAsStream("../images/favorite-unselected.png"));

    @FXML protected void starIconClicked(MouseEvent event) {
        if (!favorite) {
            starIcon.setImage(yellowStar);
        } else {
            starIcon.setImage(blankStar);
        }

        favorite = !favorite;
    }
}
