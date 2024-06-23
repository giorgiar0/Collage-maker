package ge.edu.sangu;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Collage Maker");

    }


    public static void main(String[] args) {

        Properties prop = new Properties();

        String name = prop.getProperty("app.name");
        String description = prop.getProperty("app.description");

        Logger logger = LogManager.getLogger(String.valueOf(Main.class));

        launch();
    }
}