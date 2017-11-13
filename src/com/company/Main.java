package com.company;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.setItems(FXCollections.observableArrayList(
                "Red", "Green", "Yellow", "Blue", "Black"
        ));
        Color[] color = new Color[]{Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE, Color.BLACK};

        Rectangle rectangle = new Rectangle(200, 200, Color.BLUE);
        rectangle.setTranslateX(100);
        rectangle.setTranslateY(100);
        choiceBox.getSelectionModel().selectedIndexProperty().addListener(
                (observable, oldValue, newValue) -> rectangle.setFill(color[newValue.intValue()])

        );


        pane.getChildren().addAll(rectangle, choiceBox);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}

