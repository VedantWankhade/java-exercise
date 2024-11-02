package de.vedantwankha.java.liang.fx.bouncingball.fxbouncingball;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        BouncingBallPane bouncingBallPane = new BouncingBallPane(Color.GREEN);
        Scene scene = new Scene(bouncingBallPane, 200, 200);
        stage.setScene(scene);
        stage.setTitle("BouncingBall");
        stage.show();
        bouncingBallPane.requestFocus();
        bouncingBallPane.startAnimation(2);
        bouncingBallPane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case KeyCode.UP -> bouncingBallPane.increaseSpeed();
                case KeyCode.DOWN -> bouncingBallPane.decreaseSpeed();
            }
        });
        bouncingBallPane.getXProperty().addListener((_, oldVal, newVal) -> System.out.println(oldVal + " -> " + newVal));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
