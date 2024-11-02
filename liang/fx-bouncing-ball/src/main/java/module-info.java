module de.vedantwankha.java.liang.fx.bouncingball.fxbouncingball {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.vedantwankha.java.liang.fx.bouncingball.fxbouncingball to javafx.fxml;
    exports de.vedantwankha.java.liang.fx.bouncingball.fxbouncingball;
}