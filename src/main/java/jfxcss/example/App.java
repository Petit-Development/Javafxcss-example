package jfxcss.example;

import java.net.URL;

import fr.brouillard.oss.cssfx.CSSFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

  public void start(Stage stage) {
    CSSFX.start();
    Pane rootPane = new Pane();
    addStyleSheet(rootPane);

    Scene scene = new Scene(rootPane, 500, 500);
    Rectangle rec = new Rectangle(200, 300);
    Rectangle rec2 = new Rectangle(100, 50);

    rec.getStyleClass().add("primary");
    rec2.getStyleClass().add("secondary");
    rootPane.getChildren().addAll(rec, rec2);
    stage.setScene(scene);

    stage.show();
  }

  public void addStyleSheet(Pane node) {
    URL stylesheetURL = App.class.getResource("main.css");
    String stylesheet = stylesheetURL.toExternalForm();
    node.getStylesheets().add(stylesheet);
  }
}
