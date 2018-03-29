package giufd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;
import java.util.ArrayList;

public class Main extends Application  {
	private  Button nextWith, exitWith, backWith, exitDep, backDep,nextDep,transferMain, withdrawalMain,
	depositMain, exitMain, accountinfoMain, balanceAccI, transactionAccI, nextAccI, exitAccI, backAccI,
	signHome, exitHome;

    @Override



  public void start(Stage stage) {
    	//Beginning of HOMESCREEN



	    GridPane paneHome = new GridPane();
	      paneHome.setPadding(new Insets(10, 10, 10, 10));
	      paneHome.setHgap(15);
	      paneHome.setVgap(30);
	      signHome = new Button("Sign in");
	      exitHome = new Button("Exit");

	      Label welcomeHome = new Label("Welcome To The Bank of America");
	      Label pinHome = new Label("Enter your PIN");
	      TextField textHome = new TextField();
	      // textHome.getText();

	      paneHome.add(welcomeHome,0,0);
	      paneHome.add(pinHome,0,1);
	      paneHome.add(textHome,1,1);
	      paneHome.add(signHome,0,2);


	      Scene sceneHome = new Scene(paneHome);
	      stage.setTitle("HomeScreen");
	      stage.setScene(sceneHome);
	      stage.show();

//End of HOMESCREEN


//Start of main

GridPane paneMain = new GridPane();

paneMain.setPadding(new Insets(10, 10, 10, 10));
paneMain.setHgap(30);
paneMain.setVgap(30);

//Main buttons
withdrawalMain = new Button("Withdrawal");
depositMain = new Button("Deposit");
transferMain = new Button("Balance");
accountinfoMain = new Button("Account Info");
exitMain = new Button("Exit");

//adding buttons to paneMain

paneMain.add(transferMain, 0, 0);
paneMain.add(accountinfoMain, 0, 1);
paneMain.add(withdrawalMain, 1, 1);
paneMain.add(depositMain, 1, 0);
paneMain.add(exitMain, 1, 2);

//Setting pane1 to scene 1
Scene sceneMain = new Scene(paneMain);
//stage.setScene(sceneMain);
//stage.setTitle("ATM");
//stage.show();

//End of Main

//Start of action handlers for HOMESCREEN

	signHome.setOnAction(e ->{
		if(isRealPin(textHome.getText())) {
			
			stage.setTitle("ATM");
			stage.setScene(sceneMain);
		}
		
		else {
			System.out.println("kjnfknfkrfn");
		}
		
		
		
		
		
		
		
		
		
	});



  }
    
   
	
    private boolean isRealPin(String s) {
    	
    	ArrayList <String> pins = new ArrayList<String>();
       pins.add("123");
       
       if(pins.contains(s)) {
    	   return true;
       }
       else {
    	   return false;
       }
    }
    
    
     
 


    public static void main(String[] args) {
      Application.launch(Main.class, args);

    }




}
