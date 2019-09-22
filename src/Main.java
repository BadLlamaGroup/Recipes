import java.io.FileInputStream;

import View.HUD;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application
{
    private BorderPane theWindow;

    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        primaryStage.setTitle( "Food 4 Life" );
        primaryStage.getIcons().add( new Image( new FileInputStream( "resources/icon.png" ) ) );

        theWindow = new BorderPane();

        // Create views
        HUD theHUD = new HUD();

        // Set initial view
        theWindow.setTop( theHUD );

        // Set alignment
        BorderPane.setAlignment( theWindow, Pos.CENTER );

        Scene theScene = new Scene( theWindow, 1000, 1000 );
        primaryStage.setScene( theScene );
        primaryStage.show();
    }


    public static void main( String[] args )
    {
        launch( args );
    }
}
