package tablas;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.util.converter.NumberStringConverter;

public class Controller implements Initializable {


    @FXML
    private BorderPane root;

    

	@FXML
    private TableView<AlumnoModel> alumnosTable;

    @FXML
    private TableColumn<AlumnoModel, String> nombresColumn;

    @FXML
    private TableColumn<AlumnoModel, String> apellidosColumn;

    public Controller() throws IOException {
    	FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxml/root.fxml"));
		loader.setController(this);
		loader.load();
    
    } 
    
    
	public void initialize(URL location, ResourceBundle resources) {
		nombresColumn.setCellValueFactory(v-> v.getValue().nombreProperty());
		apellidosColumn.setCellValueFactory(v-> v.getValue().apellidoProperty());
		
		nombresColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		apellidosColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		
		AlumnoModel alumno=new AlumnoModel();
		alumno.setNombre("Juan");
		alumno.setApellido("García");
		
		alumnosTable.getItems().add(alumno);
		
		
	}

	public TableView<AlumnoModel> getAlumnosTable() {
		return alumnosTable;
	}
	public BorderPane getRoot() {
		return root;
	}
}
