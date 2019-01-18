package application;

import java.text.DecimalFormat;

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
	
	private Radio miRadio; 
	@FXML
	private TextField stationTextField;
	@FXML
	private ToggleButton selectButton;
	@FXML
	private ToggleButton saveButton;
	@FXML
	private Button backButton;
	@FXML
	private Button nextButton;
	@FXML
	private Button frequencyButton;
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
		Button currentButton = (Button)event.getSource();
		if (miRadio.getState()) {
			deactivateButtons();
			currentButton.setText("OFF");
			stationTextField.setText("");
		}else {
			activateButtons();
			currentButton.setText("ON");
			stationTextField.setText(new DecimalFormat("0.0").format(miRadio.getStation()));
		}
		miRadio.toggle();
	}
	
	/**
	 * Llama al metodo que cambia de frecuencia AM o FM
	 */
	public void changeFrequency(ActionEvent event) {
		Button currentButton = (Button)event.getSource();
		miRadio.changeFrequency();
		if (miRadio.getFrequency()) {
			currentButton.setText("FM");
		}else {
			currentButton.setText("AM");
		}
		
		stationTextField.setText(new DecimalFormat("0.0").format(miRadio.getStation()));
	}
	
	/**
	 * Llama al metodo que cambia la estacion
	 */
	public void changeStation(ActionEvent event) {
		String currentButton = ((Node) event.getSource()).getId();
		if (currentButton.equals("backButton")) {
			miRadio.changeStation(false);
		}else if (currentButton.equals("nextButton")) {
			miRadio.changeStation(true);
		}
		stationTextField.setText(new DecimalFormat("0.0").format(miRadio.getStation()));
	}
	
	/**
	 * Llama al metodo que selecciona o guarda una estacion en un boton
	 */
	public void favouriteButtons(ActionEvent event) {
		Button currentButton = (Button)event.getSource();
		if (selectButton.isSelected()) {
			miRadio.changeStationButton(Integer.parseInt(currentButton.getText())-1);
			if (miRadio.getFrequency()) {
				frequencyButton.setText("FM");
			}else {
				frequencyButton.setText("AM");
			}
			stationTextField.setText(new DecimalFormat("0.0").format(miRadio.getStation()));
		}else if (saveButton.isSelected()) {
			miRadio.saveStation(Integer.parseInt(currentButton.getText())-1);
			selectButton.setSelected(true);
			saveButton.setSelected(false);
			
		}
		
	}
	
	/**
	 * Desactiva todos los botones
	 */
	public void deactivateButtons() {
		nextButton.setDisable(true);
		backButton.setDisable(true);
		frequencyButton.setDisable(true);
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
		nextButton.setDisable(false);
		backButton.setDisable(false);
		frequencyButton.setDisable(false);
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
		miRadio = new Radioimp();
		//Se crean los toggleGroups para unir los toggleButtons
		ToggleGroup group1 = new ToggleGroup();
		selectButton.setToggleGroup(group1);
		saveButton.setToggleGroup(group1);
		stationTextField.setDisable(true);
		deactivateButtons();
    }
}
