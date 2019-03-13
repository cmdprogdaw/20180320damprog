package examen.ejercicio1;

public class SociedadAnonima extends Contratistas {
	
	private String nombre_sa;
	private String[] lista_trabajos;

	public SociedadAnonima(String nombre, String apellidos, String fecha_contratacion, int nºcuenta_bancaria,
			int num_sociedades, String nombre_sa, String[] lista_trabajos) {
		super(nombre, apellidos, fecha_contratacion, nºcuenta_bancaria, num_sociedades);
		this.nombre_sa = nombre_sa;
		this.lista_trabajos = lista_trabajos;
	}

	public String getNombre_sa() {
		return nombre_sa;
	}


}
