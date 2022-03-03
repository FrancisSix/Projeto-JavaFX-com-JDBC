module fx.projetjavafxcomjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens fx.projetjavafxcomjdbc to javafx.fxml;
    exports fx.projetjavafxcomjdbc;
}