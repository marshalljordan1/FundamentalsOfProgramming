

import java.util.ArrayList;
import java.util.Scanner;

public class POOClase2Ejercicioextra {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String marca, modelo;
		int i = 0;
		boolean encontrado = false;
		ArrayList<NewOrdenador> listado = new ArrayList<NewOrdenador>();

		NewOrdenador cpu1 = new NewOrdenador("Packard Bell", "345HT", "Pentium", 16, 1000);
		NewOrdenador cpu2 = new NewOrdenador("HP", "4700P", "PentiumII", 32, 1000);
		NewOrdenador cpu3 = new NewOrdenador("Acer", "345HT", "Acer", 32, 500);
		NewOrdenador cpu4 = new NewOrdenador("Lenovo", "yoga", "Core i5", 64, 1000);
		NewOrdenador cpu5 = new NewOrdenador("Asus", "Aspire5", "Core i7", 64, 1000);

		listado.add(cpu1);
		listado.add(cpu2);
		listado.add(cpu3);
		listado.add(cpu4);
		listado.add(cpu5);

		int tamaño = listado.size();
		for (int j = 0; j < tamaño; j++) {
			System.out.println(listado.get(j));
		}
		comprarOrdenador(listado);
	}

	public static void comprarOrdenador(ArrayList<NewOrdenador> listado) {
		boolean encontrado = false;
		int i = 0;
		int tamaño = listado.size();

		System.out.println("Introduzca la Marca que está buscando: ");
		String marca = sc.nextLine();
		System.out.println("Introduzca el Modelo que está buscando: ");
		String modelo = sc.nextLine();

		int posicion = buscarOrdenador(listado, marca, modelo);

		if (posicion == -1) {
			System.out.println("Lo sentimos, no tenemos el modelo y Marca que busca");

		} else
			System.out.println("usted ha comprado este ordenador  "+listado.get(posicion).getMarca()+"  "+listado.get(posicion).getModelo());
			listado.remove(posicion);
			
			int size2 = listado.size();
			for (int j = 0; j < size2; j++) {
				System.out.println(listado.get(j));
			}
			
	}

	public static int  buscarOrdenador(ArrayList<NewOrdenador> listado, String marca, String modelo) {
		int i = 0;
		boolean encontrado = false;
		int posicion = -1;
		int size = listado.size();

		while (i < size && !encontrado) {
			if (listado.get(i).getMarca().equalsIgnoreCase(marca)
					&& listado.get(i).getModelo().equalsIgnoreCase(modelo)) {
				encontrado = true;
				posicion = i;
			}
			i++;
		}
		return posicion;
	}
		

		// primera variacion del programa. Comento para realizar la segunda
		/*
		 * cpu1.programa("Eclipse");
		 * 
		 * System.out.println(cpu1.getMarca());
		 * 
		 * System.out.println(cpu2.getProcesador());
		 * 
		 * System.out.println(cpu2.toString()); System.out.println(cpu1.toString());
		 */

	}