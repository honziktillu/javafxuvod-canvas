package com.example.javafxuvoduvod;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public AnchorPane mainLayout;
    public Canvas canvas;
    GraphicsContext gc;
    Entity entity;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        entity = new Entity(200, 300, 100, 200, Paint.valueOf("RED"));
        gc = canvas.getGraphicsContext2D();
        Platform.runLater(() -> {
            mainLayout.requestFocus();
        });
    }

    public void onMouseMoved(MouseEvent mouseEvent) {
        gc.setFill(Paint.valueOf("BLUE"));
        gc.fillOval(mouseEvent.getX(), mouseEvent.getY(), 3, 3);
    }

    public void onKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getText().equalsIgnoreCase("w")) {
            entity.setY(entity.getY() - 1);
        }
        if (keyEvent.getText().equalsIgnoreCase("s")) {
            entity.setY(entity.getY() + 1);
        }
        if (keyEvent.getText().equalsIgnoreCase("a")) {
            entity.setX(entity.getX() - 1);
        }
        if (keyEvent.getText().equalsIgnoreCase("d")) {
            entity.setX(entity.getX() + 1);
        }
        gc.setFill(Paint.valueOf("WHITE"));
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setFill(entity.getC());
        gc.fillRect(entity.getX(), entity.getY(), entity.getW(), entity.getH());
    }
}