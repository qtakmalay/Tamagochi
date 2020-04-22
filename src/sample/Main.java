package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.*;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tamagochi");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        primaryStage.setScene(new Scene(grid, 300, 275));

        Label label = new Label("Name:");
        final TextField name = new TextField();
        root.getId().indexOf("name");
        name.getText();
        GridPane.setConstraints(name, 0, 0);
        grid.getChildren().add(name);




        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
