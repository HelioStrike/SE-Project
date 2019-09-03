import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import java.util.List;

public class JavaFXProjectSkel extends Application {
    public static void main(String[] args) {
        System.out.println("Launching JavaFX Application");
        launch();
    }
    public void init() {
        System.out.println("Calling init method");
    }

    public void start(Stage stage) {
        System.out.println("Calling start method");
        stage.setTitle("Hospice Connect");

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: white");

        Label projTitle = new Label("Hospice Connect");

        final Pane cardsPane = new StackPane();
        cardsPane.setStyle("-fx-background-color: yellow");

        final Group card1 = new JavaFXProjectUIOne();
        final Group card2 = new JavaFXProjectUITwo();
        final Group card3 = new JavaFXProjectUIThree();

        cardsPane.getChildren().addAll(card1,card2,card3);

        RadioButton btn1 = new RadioButton("1");
        RadioButton btn2 = new RadioButton("2");
        RadioButton btn3 = new RadioButton("3");

        ToggleGroup group = new ToggleGroup();
        btn1.setToggleGroup(group);
        btn2.setToggleGroup(group);
        btn3.setToggleGroup(group);

        btn1.getStyleClass().remove("radio-button");
        btn1.getStyleClass().add("toggle-button");
        btn2.getStyleClass().remove("radio-button");
        btn2.getStyleClass().add("toggle-button");
        btn3.getStyleClass().remove("radio-button");
        btn3.getStyleClass().add("toggle-button");

        showNodeHideNodes(cardsPane.getChildren(), card1);

        btn1.setOnAction(
            new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent t)
                {
                    showNodeHideNodes(cardsPane.getChildren(), card1);
                }
            }
        );

        btn2.setOnAction(
            new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent t)
                {
                    showNodeHideNodes(cardsPane.getChildren(), card2);
                }
            }
        );

        btn3.setOnAction(
            new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent t)
                {
                    showNodeHideNodes(cardsPane.getChildren(), card3);
                }
            }
        );

        HBox buttonsPane = new HBox();
        buttonsPane.setStyle("-fx-background-color: red");
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.getChildren().addAll(btn1,btn2,btn3);
        
        borderPane.setTop(projTitle);
        borderPane.setAlignment(projTitle,Pos.CENTER);
        borderPane.setCenter(cardsPane);
        borderPane.setBottom(buttonsPane);

        stage.setScene(new Scene(borderPane));
        stage.setWidth(400);
        stage.setHeight(600);
        stage.show();
    }

    private static void showNodeHideNodes(List<Node> nodes, Node nodeToShow) {
        for(Node node: nodes) {
            if(node.equals(nodeToShow)) node.setVisible(true);
            else node.setVisible(false);
        }
    }

    public void stop() {
        System.out.println("Calling stop method");
    }
}