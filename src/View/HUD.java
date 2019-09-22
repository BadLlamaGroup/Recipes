package View;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

public class HUD extends FlowPane
{
    private FlowPane theHUD;

    public HUD( ) throws IOException
    {
        theHUD = new FlowPane( Orientation.HORIZONTAL );
        theHUD.setPrefWidth( 1000 );
        theHUD.setPrefHeight( 75 );
        theHUD.setHgap( 10 );
        theHUD.setStyle( "-fx-background-color: linear-gradient(to bottom, #0087CB, #000000);" );
        theHUD.setAlignment( Pos.CENTER );

        ImageView searchIcon = new ImageView( new Image( new FileInputStream( "resources/search.png" ) ) );
        searchIcon.setFitHeight( 50 );
        searchIcon.setFitWidth( 50 );
        searchIcon.setSmooth( true );
        searchIcon.setCache( true );

        FlowPane searchPane = new FlowPane( searchIcon, makeSearchArea() );

        theHUD.getChildren().addAll( makeHomeBtn(), searchPane, makeAccountBtn(), makeLogoutBtn(), makeCartBtn() );

        this.getChildren().add( theHUD );
    }

    private Button makeHomeBtn( )
    {
        Button homeBtn = new Button();
        homeBtn.setText( "Home" );
        homeBtn.setPrefSize( 100, 50 );
        setButtonStyle( homeBtn );
        return homeBtn;
    }

    private TextField makeSearchArea( )
    {
        TextField searchArea = new TextField();
        searchArea.setPromptText( "Search for recipes" );
        searchArea.setPrefSize( 350, 50 );
        return searchArea;
    }

    private Button makeAccountBtn( )
    {
        Button accountBtn = new Button();
        accountBtn.setText( "Manage Account" );
        accountBtn.setPrefSize( 150, 50 );
        setButtonStyle( accountBtn );
        return accountBtn;
    }

    private Button makeLogoutBtn( )
    {
        Button logoutBtn = new Button();
        logoutBtn.setText( "Logout" );
        logoutBtn.setPrefSize( 150, 50 );
        setButtonStyle( logoutBtn );
        return logoutBtn;
    }

    private Button makeCartBtn( )
    {
        Button cartBtn = new Button();
        cartBtn.setText( "Cart" );
        cartBtn.setPrefSize( 150, 50 );
        setButtonStyle( cartBtn );
        return cartBtn;
    }

    private void setButtonStyle( Button aButton )
    {
        String style = "-fx-background-color: cornflowerblue;";
        style += "-fx-font-size: 12pt;";
        style += "-fx-border-style: solid;";
        style += "-fx-border-width: 2px;";
        style += "-fx-border-color: darkblue;";
        style += "-fx-text-fill: snow;";
        aButton.setStyle( style );
    }
}
