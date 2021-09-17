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
    var s = CSSFX.start();
    Pane rootPane = new Pane();
    addStyleSheet(rootPane);

    Scene scene = new Scene(rootPane, 400, 400);
    Rectangle rec = new Rectangle(200, 300);

    rootPane.getChildren().add(rec);
    stage.setScene(scene);

    stage.show();
  }

  public void addStyleSheet(Pane node) {
    URL stylesheetURL = App.class.getResource("main.css");
    String stylesheet = stylesheetURL.toExternalForm();
    node.getStylesheets().add(stylesheet);
  }
}
