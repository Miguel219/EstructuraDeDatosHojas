package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

/**
 * @author pecos
 *
 */
public class MainController {
	
	//Instanciamos nuestro radio.
	Radio miRadio = new Radioimp();
	@FXML
	private TextField stationTextField;
	@FXML
	private ToggleButton onButton;
	@FXML
	private ToggleButton offButton;
	@FXML
	private ToggleButton amButton;
	@FXML
	private ToggleButton fmButton;
	@FXML
	private ToggleButton selectButton;
	@FXML
	private ToggleButton saveButton;
	@FXML
	private Button backButton;
	@FXML
	private Button nextButton;
	@FXML
	private Button Button1;
	@FXML
	private Button Button2;
	@FXML
	private Button Button3;
	@FXML
	private Button Button4;
	@FXML
	private Button Button5;
	@FXML
	private Button Button6;
	@FXML
	private Button Button7;
	@FXML
	private Button Button8;
	@FXML
	private Button Button9;
	@FXML
	private Button Button10;
	@FXML
	private Button Button11;
	@FXML
	private Button Button12;
	
	/**
	 * Llama al metodo que apaga o enciende la radio
	 */
	public void turnOn(ActionEvent event) {
		String currentButton = ((Node) event.getSource()).getId();
		if (currentButton.equals("onButton")) {
			activateButtons();
		}else if (currentButton.equals("offButton")) {
			deactivateButtons();
		}
	}
	
	/**
	 * Llama al metodo que cambia de frecuencia AM o FM
	 */
	public void changeFrequency(ActionEvent event) {
		String currentButton = ((Node) event.getSource()).getId();
		if (currentButton.equals("amButton")) {
			
		}else if (currentButton.equals("fmButton")) {
			
		}
	}
	
	/**
	 * Llama al metodo que cambia la estacion
	 */
	public void changeStation(ActionEvent event) {
		String currentButton = ((Node) event.getSource()).getId();
		if (currentButton.equals("selectButton")) {
			
		}else if (currentButton.equals("saveButton")) {
			
		}
	}
	
	/**
	 * Llama al metodo que selecciona o guarda una estacion en un boton
	 */
	public void favouriteButtons(ActionEvent event) {
		if (selectButton.isSelected()) {
			
		}else if (saveButton.isSelected()) {
			
		}
	}
	
	/**
	 * Desactiva todos los botones
	 */
	public void deactivateButtons() {
		amButton.setDisable(true);
		fmButton.setDisable(true);
		nextButton.setDisable(true);
		backButton.setDisable(true);
		selectButton.setDisable(true);
		saveButton.setDisable(true);
		Button1.setDisable(true);
		Button2.setDisable(true);
		Button3.setDisable(true);
		Button4.setDisable(true);
		Button5.setDisable(true);
		Button6.setDisable(true);
		Button7.setDisable(true);
		Button8.setDisable(true);
		Button9.setDisable(true);
		Button10.setDisable(true);
		Button11.setDisable(true);
		Button12.setDisable(true);
	}
	
	/**
	 * Activa todos los botones
	 */
	public void activateButtons() {
		amButton.setDisable(false);
		fmButton.setDisable(false);
		nextButton.setDisable(false);
		backButton.setDisable(false);
		selectButton.setDisable(false);
		saveButton.setDisable(false);
	}
	
	/**
	 * Activa los botones que guardan las estaciones favoritas
	 */
	public void activateFavouriteButtons() {
		Button1.setDisable(false);
		Button2.setDisable(false);
		Button3.setDisable(false);
		Button4.setDisable(false);
		Button5.setDisable(false);
		Button6.setDisable(false);
		Button7.setDisable(false);
		Button8.setDisable(false);
		Button9.setDisable(false);
		Button10.setDisable(false);
		Button11.setDisable(false);
		Button12.setDisable(false);
	}
	
	/**
	 * Llama al metodo que agrega o cambia estaciones favoritas 
	 */
	public void Buttons() {
		
	}
	
	/**
	 * Inicializa los objetos de la interfaz grafica
	 */
	@FXML
    public void initialize() {
		//Se crean los toggleGroups para unir los toggleButtons
		ToggleGroup group1 = new ToggleGroup();
		onButton.setToggleGroup(group1);
		offButton.setToggleGroup(group1);
		ToggleGroup group2 = new ToggleGroup();
		amButton.setToggleGroup(group2);
		fmButton.setToggleGroup(group2);
		ToggleGroup group3 = new ToggleGroup();
		selectButton.setToggleGroup(group3);
		saveButton.setToggleGroup(group3);
		stationTextField.setDisable(true);
		deactivateButtons();
    }
}
