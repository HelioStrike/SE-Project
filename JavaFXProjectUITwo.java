import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import java.util.List;

public class JavaFXProjectUITwo extends Group {
    public JavaFXProjectUITwo() {
        System.out.println("Calling project UI constructor method");
        Label label = new Label("Card 2");
        this.getChildren().add(label);
        this.setVisible(true);
    }
}