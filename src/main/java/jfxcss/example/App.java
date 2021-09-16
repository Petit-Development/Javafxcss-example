package jfxcss.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

  public void start(Stage stage) {
    Pane rootPane = new Pane();
    Scene scene = new Scene(rootPane, 400, 400);
    Rectangle rec = new Rectangle(200, 300);

    rec.setFill(Paint.valueOf("black"));

    rootPane.getChildren().add(rec);
    stage.setScene(scene);
    stage.show();
  }
}
