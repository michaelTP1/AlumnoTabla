package tablas;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AlumnoModel {

	private StringProperty nombre=new SimpleStringProperty();
	private StringProperty apellido=new SimpleStringProperty();
	public final StringProperty nombreProperty() {
		return this.nombre;
	}
	
	public final String getNombre() {
		return this.nombreProperty().get();
	}
	
	public final void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}
	
	public final StringProperty apellidoProperty() {
		return this.apellido;
	}
	
	public final String getApellido() {
		return this.apellidoProperty().get();
	}
	
	public final void setApellido(final String apellido) {
		this.apellidoProperty().set(apellido);
	}
	
	
}
