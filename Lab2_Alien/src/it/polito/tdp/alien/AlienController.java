package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {

	AlienDictionary dizionario;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtParola;

	@FXML
	private Button btnTranslate;

	@FXML
	private TextArea txtResult;

	@FXML
	private Button btnReset;

	@FXML
	void doReset(ActionEvent event) {

		txtResult.clear();

	}

	@FXML
	void doTranslate(ActionEvent event) {

		String testo = txtParola.getText().toLowerCase();

		if (dizionario.containsNumbers(testo)) {

			txtResult.clear();
			txtResult.setText("Numeri non ammessi!");

		} else {

			String[] parole = testo.split(" ");

			if (parole.length == 2) {
				dizionario.addWord(parole[0], parole[1]);
			}

			if (parole.length == 1) {
				txtResult.clear();
				txtResult.setText(dizionario.translateWord(parole[0]));
			}

		}

		txtParola.clear();

	}

	@FXML
	void initialize() {
		assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Alien.fxml'.";
		assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
		assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

		dizionario = new AlienDictionary();
	}
}
