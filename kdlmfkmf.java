package gui;
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

public class kdlmfkmf extends Application {
	private  Button chequinWith, savingWith, creditWith, exitWith, backWith,chequinDep,
	savingDep, creditDep, exitDep, backDep,	transferMain, withdrawalMain,
	depositMain, exitMain, accountinfoMain, chequinAccI, savingAccI, creditAccI, exitAccI, backAccI,
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

// adding buttons to paneMain

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

// End of Main



//start of Withdrawal
GridPane paneWith = new GridPane();
paneWith.setPadding(new Insets(10,10,10,10));
paneWith.setHgap(10);
paneWith.setVgap(10);


chequinWith = new Button("Chequing");
savingWith = new Button("Saving");
creditWith = new Button("Credit");
exitWith = new Button("Exit");
backWith = new Button("Back");

paneWith.add(chequinWith,0,0);
paneWith.add(savingWith,0,1);
paneWith.add(creditWith,1,0);
paneWith.add(backWith,0,2);
paneWith.add(exitWith,1,2);

Scene sceneWith = new Scene(paneWith);
//stage.setScene(sceneWith);
//stage.setTitle("Withdrawal");
//stage.show();

//End of Withdrawal

//Start of DEPOSIT
GridPane paneDep = new GridPane();
paneDep.setPadding(new Insets(10,10,10,10));
paneDep.setHgap(10);
paneDep.setVgap(10);

chequinDep= new Button("Chequing");
savingDep = new Button("Saving");
creditDep = new Button("Credit");
exitDep = new Button("Exit");
backDep = new Button("Back");

paneDep.add(chequinDep,0,0);
paneDep.add(savingDep,0,1);
paneDep.add(creditDep,1,0);
paneDep.add(backDep,0,2);
paneDep.add(exitDep,1,2);

Scene sceneDep = new Scene(paneDep);
//stage.setScene(sceneDep);
//stage.setTitle("Deposit");
//stage.show();

//End of DEPOSIT


//start of Account Info

GridPane paneAccI = new GridPane();
paneAccI.setPadding(new Insets(10,10,10,10));
paneAccI.setHgap(10);
paneAccI.setVgap(10);

chequinAccI = new Button("Chequing");
savingAccI = new Button("Saving");
creditAccI = new Button("Credit");
exitAccI = new Button("Exit");
backAccI = new Button("Back");

paneAccI.add(chequinAccI,0,0);
paneAccI.add(savingAccI,0,1);
paneAccI.add(creditAccI,1,0);
paneAccI.add(backAccI,0,2);
paneAccI.add(exitAccI,1,2);

Scene sceneAccI = new Scene(paneAccI);
//stage.setScene(sceneAccI);
//stage.setTitle("Account Information");
//stage.show();

//end of ACCOUnt Info






















  }
    public static void main(String[] args) {
	      Application.launch(args);

	    }

}
