import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;

import java.util.List;

public class JavaFXProjectUIOne extends Group {
    public JavaFXProjectUIOne() {
        System.out.println("Calling project UI constructor method");

        WebView webView = new WebView();
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        webView.setMinSize(primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight()-80);
        webView.setMaxSize(primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight()-80);
        webView.getEngine().load("https://www.google.com/maps/search/hospitals+near+me");

        this.getChildren().add(webView);
        this.setVisible(true);
    }
}