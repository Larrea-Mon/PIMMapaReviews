package es.deusto.pim.client;

import java.util.Scanner;

public class MapRevService {
	
	private static MapRevService instance;
	private Scanner in;
	private int choice;
	
	public static MapRevService getInstance() {
		if(instance == null) {
			instance = new MapRevService();
		}
		return instance;
	}
	private MapRevService() {
		
	}
	
	
	public void run() {
		System.out.println("Vienvenid@ al sistema de busqueda de caminos adaptados a personas con movilidad reducida");
		MapRevCon.populateDB();
		menu1();
	}
	private void menu1() {
		System.out.println("Elige lo que quieres hacer");
		System.out.println("0: Empezar un viaje");
		System.out.println("1: Escribir una review de un camino");
		System.out.println("2: Ver las reviews de un camino");
		System.out.println("3: Escribir una review de un lugar");
		System.out.println("4; Ver las reviews de un lugar");
		
		in = new Scanner(System.in);
		choice = in.nextInt();
		
		if (choice == 0) {
			menuViaje();
		}else if (choice == 1) {
			menuEscReviewCaminos();
		}else if (choice == 2) {
			menuVerReviewCaminos();
		}else if (choice == 3) {
			menuEscReviewLugar();
		}else if (choice == 4) {
			menuVerReviewLugar();
		}
		
	}
	private void menuVerReviewLugar() {
		// TODO Auto-generated method stub
		
	}
	private void menuEscReviewLugar() {
		// TODO Auto-generated method stub
		
	}
	private void menuVerReviewCaminos() {
		// TODO Auto-generated method stub
		
	}
	private void menuEscReviewCaminos() {
		// TODO Auto-generated method stub
		
	}
	private void menuViaje() {
		// TODO Auto-generated method stub
		
	}
}
