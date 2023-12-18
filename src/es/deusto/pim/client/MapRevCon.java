package es.deusto.pim.client;

import java.util.ArrayList;
import java.util.Map;

import es.deusto.pim.client.domain.Calle;
import es.deusto.pim.client.domain.Lugar;
import es.deusto.pim.client.domain.Conexion;

public class MapRevCon {
	private static MapRevCon instance;
	ArrayList<Lugar> lugares;
	ArrayList<Calle> calles;
	ArrayList<Conexion> conexiones;
	
	public static MapRevCon getInstance() {
		if (instance ==  null) {
			instance = new MapRevCon();
		}
		return instance;
	}

	public static void populateDB() {
		MapRevCon.getInstance().lugares.add(new Lugar("San Mames"));
		MapRevCon.getInstance().lugares.add(new Lugar("Estacion Moyua"));
		MapRevCon.getInstance().lugares.add(new Lugar("Museo Gugghenheim"));
		MapRevCon.getInstance().lugares.add(new Lugar("Alhondiga"));
		
		MapRevCon.getInstance().calles.add(new Calle("Gran Via"));
		MapRevCon.getInstance().calles.add(new Calle("Alameda de Recalde"));
		MapRevCon.getInstance().calles.add(new Calle("Iparraguirre Kalea"));
		MapRevCon.getInstance().calles.add(new Calle("Ercilla Kalea"));
		MapRevCon.getInstance().calles.add(new Calle("Abandoibarra Etorbidea"));
		MapRevCon.getInstance().calles.add(new Calle("Sabino Arana Etorbidea"));
		
		MapRevCon.getInstance();
	}

	public ArrayList<Lugar> getLugares() {
		return lugares;
	}

	public void setLugares(ArrayList<Lugar> lugares) {
		this.lugares = lugares;
	}

	public ArrayList<Calle> getCalles() {
		return calles;
	}

	public void setCalles(ArrayList<Calle> caminos) {
		this.calles = caminos;
	}	

		
}
