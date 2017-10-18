import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceDialog;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.ArrayList;


public class Switch extends Application{
	@Override
	public void start(Stage primaryStage){
	
		ArrayList<String> choices = new ArrayList<String>();
		choices.add("Administrator");
		choices.add("Faculty");
		choices.add("Staff");
		choices.add("Student");
		choices.add("Guest");

		ChoiceDialog<String> role = new ChoiceDialog("Administrator", choices);
		role.setTitle("What is your role?");
		role.setContentText("Please select your role");
		Optional<String> result = role.showAndWait();

		switch(result.get()){
			case "Administrator":
				System.out.println("Welcome Administrator");
				break;

			case "Faculty":
				System.out.println("Welcome Faculty");
				break;

			case "Staff":
				System.out.println("Welcome Staff");
				break;

			case "Student":
				System.out.println("Welcome Student");
				break;

			case "Guest":
				System.out.println("Welcome Guest");
		} 
	}
}
