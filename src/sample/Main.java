package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main /* extends Application */ {

    /*
    @Override

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Colas");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    */

    public static void main(String[] args){
        Cola cola = new Cola();

        cola.insertar(5);
        cola.insertar(10);
        cola.insertar(20);
        cola.mostrar();
        cola.extraer();
        cola.mostrar();
        cola.insertar(2);
        cola.mostrar();
    }
}
