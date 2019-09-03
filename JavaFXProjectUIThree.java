import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import java.util.List;

public class JavaFXProjectUIThree extends Group {
    public JavaFXProjectUIThree() {
        System.out.println("Calling project UI constructor method");
        Label label = new Label("Card 3");
        this.getChildren().add(label);
        this.setVisible(true);
    }
}