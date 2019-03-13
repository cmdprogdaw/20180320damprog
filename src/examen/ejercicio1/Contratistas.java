package examen.ejercicio1;

public class Contratistas extends Empleados{
	
	private int num_sociedades;

	public Contratistas(String nombre, String apellidos, String fecha_contratacion, int nºcuenta_bancaria, int num_sociedades) {
		super(nombre, apellidos, fecha_contratacion, nºcuenta_bancaria);
		this.num_sociedades = num_sociedades;
	}

	@Override
	public String toString() {
		return super.toString() + "Contratistas [num_sociedades=" + num_sociedades + "]";
	}




}
