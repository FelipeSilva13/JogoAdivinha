import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;


public class JavaFx extends Application {
    @Override

    public void start(Stage stage) {
        Label label = new Label("Hello World");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Minha Primeira Aplicação JavaFx");
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

}

