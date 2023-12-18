package es.deusto.pim.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import es.deusto.pim.client.domain.*;

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
		System.out.println("1: Escribir una review de una calle");
		System.out.println("2: Ver las reviews de un camino");
		
		in = new Scanner(System.in);
		choice = in.nextInt();
		
		if (choice == 0) {
			menuViaje1();
		}else if (choice == 1) {
			menuEscReviewCaminos();
		}else if (choice == 2) {
			menuVerReviewCaminos();
		}
	}
	private void menuVerReviewCaminos() {
		ArrayList<Calle> results = MapRevCon.getInstance().getCalles();
		for (int i = 0; i < results.size(); i++) {
			System.out.println(i +": " + results.get(i).getName());
		}
		in = new Scanner(System.in);
		choice = in.nextInt();
		menuReviewDetalle(choice);
		
	}
	private void menuReviewDetalle(int i) {
		ArrayList<Calle> results = MapRevCon.getInstance().getCalles();
		System.out.println("La calle " + results.get(i).getName() + " tiene las siguientes reviews: \n");
		for (int j = 0; j < results.get(i).getReviews().size(); j++) {
			System.out.print(results.get(i).getReviews().get(j).getScore()+ ", ");
		}
		System.out.println("\n");
	menu1();
		
	}
	private void menuEscReviewCaminos() {
		System.out.println("Estos son los caminos para los que puedes escribir una review");
		ArrayList<Calle> results = MapRevCon.getInstance().getCalles();
		for (int i = 0; i < results.size(); i++) {
			System.out.println(i +": " + results.get(i).getName());
		}
		in = new Scanner(System.in);
		choice = in.nextInt();
		menuWriteReviewCamino(choice);
	}
	private void menuWriteReviewCamino(int choice) {
		System.out.println("Introduce la puntuacion de tu review: ");
		in = new Scanner(System.in);
		choice = in.nextInt();
		MapRevCon.getInstance().getCalles().get(choice).getReviews().add(new Review(choice));
		System.out.println("Has creado una nueva review.\n \n");
		menu1();
	}
	private void menuViaje1() {
		System.out.println("Primero, elije un punto de partida");
		ArrayList<Lugar> results = MapRevCon.getInstance().getLugares();
		for (int i = 0; i < results.size(); i++) {
			System.out.println(i + ": " + results.get(i).getName());
		}
		System.out.println("\n");
		in = new Scanner(System.in);
		choice = in.nextInt();
		MapRevCon.getInstance().setDestino1(results.get(choice));
		menuViaje2(choice);
	}
	private void menuViaje2(int choice) {
		System.out.println("Ahora, elije un destino");
		ArrayList<Lugar> results = MapRevCon.getInstance().getLugares();
		results.remove(choice);
		
		for (int i = 0; i < results.size(); i++) {
			System.out.println(i + ": " + results.get(i).getName());
		}
		in = new Scanner(System.in);
		choice = in.nextInt();
		
		MapRevCon.getInstance().setDestino2(results.get(choice));

		menuViaje3();
	}
	private void menuViaje3() {
		ArrayList<Conexion> pool = MapRevCon.getInstance().getConexiones();
		ArrayList<Conexion> results = new ArrayList<>();
		for (int i = 0; i < pool.size(); i++) {
			if (pool.get(i).getDestination1() == MapRevCon.getInstance().destino1 && pool.get(i).getDestination2() == MapRevCon.getInstance().destino2) {
				results.add(pool.get(i));
			} else if (pool.get(i).getDestination1() == MapRevCon.getInstance().destino2 && pool.get(i).getDestination2() == MapRevCon.getInstance().destino1) {
				results.add(pool.get(i));
			}
		}
		Collections.sort(results);
		System.out.println("El camino que recomendamos es " + results.get(2).toString() + "con una puntuacion de accesibilidad de " + results.get(2).calcularScore() + "sobre 10.");
		System.out.println("Estos son los otros caminos disponibles:"); 
		for (int i = 0; i < results.size()-1; i++) {
			System.out.println(results.get(i).toString() + " con una puntuación de accesibilidad de " + results.get(i).calcularScore() + " sobre 10.");
		}
	}
}
