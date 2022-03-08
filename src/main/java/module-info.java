module fx.projetjavafxcomjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports fx.projetjavafxcomjdbc;
    opens fx.projetjavafxcomjdbc to javafx.fxml;
}
