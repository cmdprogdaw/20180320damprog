package examen.ejercicio2;

import java.util.ArrayList;

import examen.ejercicio1.Empleados;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		Empleados empleado1 = new Empleados("Pepe", "Rodriguez", "12/03/2008", 845824);
		Empleados empleado2 = new Empleados("Martina", "Perez", "26/08/2012", 357447);
		
		System.out.println(empleado1);

	}

}
