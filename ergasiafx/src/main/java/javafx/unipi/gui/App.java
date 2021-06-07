package javafx.unipi.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    static Stage primaryStage;
    static Scene mainScene, planScene,clientScene, telecommunicationCompanyScene;

    @Override
    public void start(Stage primaryStage) {

    	this.primaryStage = primaryStage;
    	
        SceneCreator mainSceneCreator = new MainSceneCreator(650, 300);
        SceneCreator planSceneCreator = new PlanSceneCreator(650, 300);
        SceneCreator clientSceneCreator = new ClientSceneCreator(650, 300);
        SceneCreator telecommunicationCompanySceneCreator= new TelecommunicationCompanySceneCreator(650 , 300);

        
        mainScene = mainSceneCreator.createScene();
        planScene = planSceneCreator.createScene();
        clientScene = clientSceneCreator.createScene();
        telecommunicationCompanyScene = telecommunicationCompanySceneCreator.createScene() ;


        primaryStage.setTitle("Καταστημα Παροχης Τηλεπικοινωνιακων Υπηρεσιων");
        primaryStage.setScene(mainScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}