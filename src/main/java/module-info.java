module fx.projetjavafxcomjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    exports fx.projetjavafxcomjdbc;
    opens fx.projetjavafxcomjdbc to javafx.fxml;
}
