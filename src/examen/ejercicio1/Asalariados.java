package examen.ejercicio1;

public class Asalariados extends Empleados {

	public Asalariados(String nombre, String apellidos, String fecha_contratacion, int nºcuenta_bancaria) {
		super(nombre, apellidos, fecha_contratacion, nºcuenta_bancaria);
		
	}

	@Override
	public String toString() {
		return super.toString() + "Asalariados []";
	}

	

}
