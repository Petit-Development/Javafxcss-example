package jfxcss.example;

import java.net.URL;

import fr.brouillard.oss.cssfx.CSSFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

  public void start(Stage stage) {
    CSSFX.start();
    Pane rootPane = new FlowPane();
    addStyleSheet(rootPane);

    Scene scene = new Scene(rootPane, 500, 200);
    Rectangle rec1 = new Rectangle(100, 100);
    Rectangle rec2 = new Rectangle(100, 100);
    Rectangle rec3 = new Rectangle(100, 100);
    Rectangle rec4 = new Rectangle(100, 100);

    rec2.getStyleClass().add("primary");
    rec3.getStyleClass().add("secondary");
    rec4.setId("title");
    rootPane.getChildren().addAll(rec1, rec2, rec3, rec4);
    stage.setScene(scene);

    stage.show();
  }

  public void addStyleSheet(Pane node) {
    URL stylesheetURL = App.class.getResource("main.css");
    String stylesheet = stylesheetURL.toExternalForm();
    node.getStylesheets().add(stylesheet);
  }
}
