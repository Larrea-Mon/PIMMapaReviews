package es.deusto.pim.client.domain;

import java.util.ArrayList;

public class Conexion implements Comparable<Conexion> {
	
	@Override
	public String toString() {
		
		
		return "Conexion entre " +  destination1.getName() + " y " + destination2.getName() + " que pasa por " + calles.toString();
	}

	Lugar destination1;
	Lugar destination2;

	ArrayList<Calle> calles;

	public Lugar getDestination1() {
		return destination1;
	}

	public void setDestination1(Lugar destination1) {
		this.destination1 = destination1;
	}

	public Lugar getDestination2() {
		return destination2;
	}

	public Conexion(Lugar lugar1, Lugar lugar2) {
		super();
		this.destination1 = lugar1;
		this.destination2 = lugar2;
		this.calles = new ArrayList<>();
	}

	public void setDestination2(Lugar destination2) {
		this.destination2 = destination2;
	}

	public ArrayList<Calle> getCalles() {
		return calles;
	}

	public void setCalles(ArrayList<Calle> calles) {
		this.calles = calles;
	}
	public float calcularScore() {
		float result = 0;
		for (int i = 0; i < calles.size(); i++) {
			result = result + calles.get(i).getAverageReviewScore();
		}
		result = result/calles.size();
		return result;
	}

	@Override
	public int compareTo(Conexion o) {
		if (o.calcularScore() < calcularScore()) {
			return 1;
		} else if (o.calcularScore() == calcularScore()) {
			return 0;
		} else if(o.calcularScore() > calcularScore()) {
			return -1;
		}
		return 0;
	}	
}
