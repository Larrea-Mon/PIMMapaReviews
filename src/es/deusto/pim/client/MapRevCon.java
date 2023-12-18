package es.deusto.pim.client;

import java.util.ArrayList;
import java.util.Map;

import es.deusto.pim.client.domain.Calle;
import es.deusto.pim.client.domain.Lugar;
import es.deusto.pim.client.domain.Review;
import es.deusto.pim.client.domain.Conexion;

public class MapRevCon {
	private static MapRevCon instance;
	ArrayList<Lugar> lugares;
	ArrayList<Calle> calles;
	ArrayList<Conexion> conexiones;
	
	Lugar destino1;
	Lugar destino2;
	
	public static MapRevCon getInstance() {
		if (instance ==  null) {
			instance = new MapRevCon();
		}
		return instance;
	}
	public MapRevCon() {
		lugares = new ArrayList<>();
		calles = new ArrayList<>();
		conexiones = new ArrayList<>();
	}

	public static void populateDB() {
		
		Lugar lugar1 = new Lugar("San Mames");
		Lugar lugar2 = new Lugar("Estacion Moyua");
		Lugar lugar3 = new Lugar("Museo Gugghenheim");
		Lugar lugar4 = new Lugar("Alhondiga");
		
		MapRevCon.getInstance().lugares.add(lugar1);
		MapRevCon.getInstance().lugares.add(lugar2);
		MapRevCon.getInstance().lugares.add(lugar3);
		MapRevCon.getInstance().lugares.add(lugar4);
		
		Calle calle1 = new Calle("Gran Via");
		Calle calle2 = new Calle("Alameca de Recalde");
		Calle calle3 = new Calle("Iparraguirre Kalea");
		Calle calle4 = new Calle("Ercilla Kalea");
		Calle calle5 = new Calle("Abandoibarra Etorbidea");
		Calle calle6 = new Calle("Sabino Arana Etorbidea");
		
		MapRevCon.getInstance().calles.add(calle1);
		MapRevCon.getInstance().calles.add(calle2);
		MapRevCon.getInstance().calles.add(calle3);
		MapRevCon.getInstance().calles.add(calle4);
		MapRevCon.getInstance().calles.add(calle5);
		MapRevCon.getInstance().calles.add(calle6);
		
		
		Conexion con12a = new Conexion(lugar1,lugar2);
		Conexion con13a = new Conexion(lugar1,lugar3);
		Conexion con14a = new Conexion(lugar1,lugar4); 		
		Conexion con23a = new Conexion(lugar2,lugar3);
		Conexion con24a = new Conexion(lugar2,lugar4);
		Conexion con34a = new Conexion(lugar3,lugar4);
		
		con12a.getCalles().add(calle3);
		con13a.getCalles().add(calle1);
		con14a.getCalles().add(calle6);
		con23a.getCalles().add(calle4);
		con24a.getCalles().add(calle2);
		con23a.getCalles().add(calle5);
		
		Conexion con12b = new Conexion(lugar1,lugar2);
		Conexion con13b = new Conexion(lugar1,lugar3);
		Conexion con14b = new Conexion(lugar1,lugar4); 		
		Conexion con23b = new Conexion(lugar2,lugar3);
		Conexion con24b = new Conexion(lugar2,lugar4);
		Conexion con34b = new Conexion(lugar3,lugar4);
		
		con12b.getCalles().add(calle1);con12b.getCalles().add(calle2);
		con13b.getCalles().add(calle3);con13b.getCalles().add(calle4);
		con14b.getCalles().add(calle1);con14b.getCalles().add(calle2);
		con23b.getCalles().add(calle1);con23b.getCalles().add(calle2);
		con24b.getCalles().add(calle4);con24b.getCalles().add(calle5);
		con23b.getCalles().add(calle1);con23b.getCalles().add(calle2);
		
		Conexion con12c = new Conexion(lugar1,lugar2);
		Conexion con13c = new Conexion(lugar1,lugar3);
		Conexion con14c = new Conexion(lugar1,lugar4); 		
		Conexion con23c = new Conexion(lugar2,lugar3);
		Conexion con24c = new Conexion(lugar2,lugar4);
		Conexion con34c = new Conexion(lugar3,lugar4);
		
		con12c.getCalles().add(calle1);con12c.getCalles().add(calle4);
		con13c.getCalles().add(calle3);con13c.getCalles().add(calle4);
		con14c.getCalles().add(calle1);con14c.getCalles().add(calle5);
		con23c.getCalles().add(calle2);con23c.getCalles().add(calle5);
		con24c.getCalles().add(calle3);con24c.getCalles().add(calle6);
		con23c.getCalles().add(calle1);con23c.getCalles().add(calle6);
				

		MapRevCon.getInstance().conexiones.add(con12a);
		MapRevCon.getInstance().conexiones.add(con13a);
		MapRevCon.getInstance().conexiones.add(con14a);
		MapRevCon.getInstance().conexiones.add(con23a);
		MapRevCon.getInstance().conexiones.add(con24a);
		MapRevCon.getInstance().conexiones.add(con34a);
		MapRevCon.getInstance().conexiones.add(con12b);
		MapRevCon.getInstance().conexiones.add(con13b);
		MapRevCon.getInstance().conexiones.add(con14b);
		MapRevCon.getInstance().conexiones.add(con23b);
		MapRevCon.getInstance().conexiones.add(con24b);
		MapRevCon.getInstance().conexiones.add(con34b);
		MapRevCon.getInstance().conexiones.add(con12c);
		MapRevCon.getInstance().conexiones.add(con13c);
		MapRevCon.getInstance().conexiones.add(con14c);
		MapRevCon.getInstance().conexiones.add(con23c);
		MapRevCon.getInstance().conexiones.add(con24c);
		MapRevCon.getInstance().conexiones.add(con34c);
		
		calle1.getReviews().add(new Review(2));
		calle1.getReviews().add(new Review(10));
		calle1.getReviews().add(new Review(7));
		
		calle2.getReviews().add(new Review(2));
		calle2.getReviews().add(new Review(4));
		calle2.getReviews().add(new Review(5));

		calle3.getReviews().add(new Review(7));
		calle3.getReviews().add(new Review(9));
		calle3.getReviews().add(new Review(8));
		
		calle4.getReviews().add(new Review(7));
		calle4.getReviews().add(new Review(10));
		calle4.getReviews().add(new Review(9));
		
		calle5.getReviews().add(new Review(3));
		calle5.getReviews().add(new Review(6));
		calle5.getReviews().add(new Review(7));
		
		calle6.getReviews().add(new Review(7));
		calle6.getReviews().add(new Review(7));
		calle6.getReviews().add(new Review(8));
		//System.out.println("[DEBUG]:cargada la lista de conexiones con: " + MapRevCon.getInstance().conexiones.size() + " conexiones.");
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
	public ArrayList<Conexion> getConexiones() {
		return conexiones;
	}
	public void setConexiones(ArrayList<Conexion> conexiones) {
		this.conexiones = conexiones;
	}
	public Lugar getDestino1() {
		return destino1;
	}
	public void setDestino1(Lugar destino1) {
		this.destino1 = destino1;
	}
	public Lugar getDestino2() {
		return destino2;
	}
	public void setDestino2(Lugar destino2) {
		this.destino2 = destino2;
	}
	public static void setInstance(MapRevCon instance) {
		MapRevCon.instance = instance;
	}	

		
}
