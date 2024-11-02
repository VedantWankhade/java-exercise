package de.vedantwankha.java.liang.fx.bouncingball.fxbouncingball;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.InvalidationListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BouncingBallPane extends Pane {
    private final int radius;
    private int x,  y, dx = 1, dy = 1;
    private final SimpleIntegerProperty xProperty = new SimpleIntegerProperty();
    private final SimpleIntegerProperty yProperty = new SimpleIntegerProperty();
    private final Circle circle;
    Timeline animation;

    public BouncingBallPane(int x, int y, int radius, Color color) {
        if (radius < 0 || x < 0 || y < 0) {
            throw new IllegalArgumentException("Arguments Radius, X and Y must be greater than 0");
        }
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.circle = new Circle(x, y, radius);
        circle.setFill(color);
        this.getChildren().add(circle);
        this.animation = new Timeline(
                new KeyFrame(Duration.millis(50), e -> moveBall())
        );
        this.animation.setCycleCount(Timeline.INDEFINITE);
        this.animation.play();
    }

    public BouncingBallPane() {
        this(20, 20, 20, Color.BLACK);
    }

    public BouncingBallPane(int radius) {
        this(radius, radius, radius, Color.BLACK);
    }

    public BouncingBallPane(Color color) {
        this(20, 20, 20, color);
    }

    public BouncingBallPane(int x, int y, int radius) {
        this(x, y, radius, Color.BLACK);
    }

    public BouncingBallPane(int radius, Color color) {
        this(radius, radius, radius, color);
    }

    public int getRadius() {
        return this.radius;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    private void moveBall() {
        if (x < radius || x > this.getWidth() - radius) {
            dx *= -1;
        }
        if (y < radius || y > this.getHeight() - radius) {
            dy *= -1;
        }
        this.x += dx;
        this.y += dy;
        this.xProperty.set(x);
        this.yProperty.set(y);
        this.circle.setCenterX(this.x);
        this.circle.setCenterY(this.y);
    }

    public void increaseSpeed() {
        if (this.animation.getRate() == 0) {
            this.animation.setRate(1);
            this.animation.play();
        } else {
            this.animation.setRate(this.animation.getRate() + 1);
        }
    }

    public void decreaseSpeed() {
        double rate = this.animation.getRate();
        if (rate == 0) {
            this.animation.pause();
            this.animation.setRate(0);
        } else {
            this.animation.setRate(this.animation.getRate() - 1);
        }
    }

    public void startAnimation(double rate) {
        this.animation.setRate(rate);
        this.animation.play();
    }

    public SimpleIntegerProperty getXProperty() {
        return this.xProperty;
    }
    public SimpleIntegerProperty getYProperty() {
        return this.yProperty;
    }
}