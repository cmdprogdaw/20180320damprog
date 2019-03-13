package examen.ejercicio1;

public class SociedadAnonima extends Contratistas {
	
	private String nombre_sa;

	public SociedadAnonima(String nombre, String apellidos, String fecha_contratacion, int nºcuenta_bancaria,
			int num_sociedades, String nombre_sa) {
		super(nombre, apellidos, fecha_contratacion, nºcuenta_bancaria, num_sociedades);
		this.nombre_sa = nombre_sa;
	}

	

}
