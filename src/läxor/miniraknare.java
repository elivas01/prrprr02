package läxor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class miniraknare extends Application implements EventHandler<ActionEvent>{

	Button knappen;
	Button knappen1;
	Button knappen2;
	Button knappen3;
	Button knappen4;
	Button knappen5;
	Button knappen6;
	Button knappen7;
	Button knappen8;
	Button knappen9;
	Button knappeni;
	Button knappenx;
	Button knappenl;
	
	String expression;
	
public static void main(String[] args) {
	launch();
}


public void start(Stage primaryStage) throws Exception {

	GridPane root = new GridPane();
	
	expression = "";
	
	knappen = new Button("1");
    knappen.setMinHeight(10);
    knappen.setMinWidth(10);
    knappen.setOnAction(this);
    
    knappen1 = new Button("2");
    knappen1.setMinHeight(10);
    knappen1.setMinWidth(10);
    knappen1.setOnAction(this);
    
    knappen2 = new Button("3");
    knappen2.setMinHeight(10);
    knappen2.setMinWidth(10);
    knappen2.setOnAction(this);
    
    knappen3 = new Button("4");
    knappen3.setMinHeight(10);
    knappen3.setMinWidth(10);
    knappen3.setOnAction(this);
    
    knappen4 = new Button("5");
    knappen4.setMinHeight(10);
    knappen4.setMinWidth(10);
    knappen4.setOnAction(this);
    
    knappen5 = new Button("6");
    knappen5.setMinHeight(10);
    knappen5.setMinWidth(10);
    knappen5.setOnAction(this);
    
    knappen6 = new Button("7");
    knappen6.setMinHeight(10);
    knappen6.setMinWidth(10);
    knappen6.setOnAction(this);
    
    knappen7 = new Button("8");
    knappen7.setMinHeight(10);
    knappen7.setMinWidth(10);
    knappen7.setOnAction(this);
    
    knappen8 = new Button("9");
    knappen8.setMinHeight(10);
    knappen8.setMinWidth(10);
    knappen8.setOnAction(this);
    
    knappen9 = new Button("0");
    knappen9.setMinHeight(10);
    knappen9.setMinWidth(10);
    knappen9.setOnAction(this); 
    
    knappeni = new Button("-");
    knappeni.setMinHeight(10);
    knappeni.setMinWidth(10);
    knappeni.setOnAction(this); 
    
    knappenx = new Button("+");
    knappenx.setMinHeight(10);
    knappenx.setMinWidth(10);
    knappenx.setOnAction(this); 
    
    knappenl = new Button("=");
    knappenl.setMinHeight(10);
    knappenl.setMinWidth(10);
    knappenl.setOnAction(this); 

    root.setTranslateX(100);
    
    root.add(knappen, 0, 0);
    
    root.add(knappen1, 1, 0);

    root.add(knappen2, 2, 0);

    root.add(knappen3, 0, 1);

    root.add(knappen4, 1, 1);

    root.add(knappen5, 2, 1);

    root.add(knappen6, 0, 2);

    root.add(knappen7, 1, 2);

    root.add(knappen8, 2, 2);

    root.add(knappen9, 1, 3);
   
    root.add(knappeni, 0, 3);
    
    root.add(knappenx, 2, 3);
   
    root.add(knappenl, 3, 3);
    
		
	Scene scene = new Scene(root, 200, 300);
	
	primaryStage.setScene(scene);
	
	primaryStage.show();
}	

public void handle(ActionEvent event) {
	
	if (event.getSource() == knappen) {
		expression += "1";
		System.out.println("1");
	}
	else if (event.getSource() == knappen1) {
		expression += "2";
		System.out.println("2");
	}
	else if (event.getSource() == knappen2) {
		expression += "3";
		System.out.println("3");
	}
	else if (event.getSource() == knappen3) {
		expression += "4";
		System.out.println("4");
}
	else if (event.getSource() == knappen4) {
		expression += "5";
		System.out.println("5");
	}
	
	else if (event.getSource() == knappen5) {
		expression += "6";
		System.out.println("6");
	}
	else if (event.getSource() == knappen6) {
		expression += "7";
		System.out.println("7");
	}
	else if (event.getSource() == knappen7) {
		expression += "8";
		System.out.println("8");
	}
	else if (event.getSource() == knappen8) {
		expression += "9";
		System.out.println("9");
	}
	else if (event.getSource() == knappen9) {
		expression += "0";
		System.out.println("0");
	}
	else if (event.getSource() == knappenx)
	{
		expression += "+";
		System.out.println("+");
	}
	else if (event.getSource() == knappenl) {
		Double result = (double) 0;
		if (expression.contains("+"))
		{
			String[] numbers = expression.split("\\+");
			Double tal1 = Double.parseDouble(numbers[0]);
			Double tal2 = Double.parseDouble(numbers[1]);
			result = tal1 + tal2;
		}

		System.out.println(result);
	}

}

}


