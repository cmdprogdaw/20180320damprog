package examen.ejercicio1;

public class Empleados {

	private String nombre;
	private String apellidos;
	private String fecha_contratacion;
	private int nºcuenta_bancaria;
	
	public Empleados(String nombre, String apellidos, String fecha_contratacion, int nºcuenta_bancaria) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_contratacion = fecha_contratacion;
		this.nºcuenta_bancaria = nºcuenta_bancaria;
	}

	public int getNºcuenta_bancaria() {
		return nºcuenta_bancaria;
	}

	public void setNºcuenta_bancaria(int nºcuenta_bancaria) {
		this.nºcuenta_bancaria = nºcuenta_bancaria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFecha_contratacion() {
		return fecha_contratacion;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_contratacion=" + fecha_contratacion
				+ ", nºcuenta_bancaria=" + nºcuenta_bancaria + "]";
	}
	
	
	
}
