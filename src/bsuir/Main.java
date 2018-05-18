package bsuir;
/*
  Created by Gleb Remniov and Christina Kovalevich.
  Cooperate: remniov.work@gmail.com

  Design: Gleb Remniov. All images and psd in folder "images"
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.setOnCloseRequest(event->System.exit(0));  //При закрытии окна, завершение работы всей программы
        primaryStage.setResizable(false);
        primaryStage.getIcons().addAll(new Image("bsuir/images/icon1.png"));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}