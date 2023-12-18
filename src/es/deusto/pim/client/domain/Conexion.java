package es.deusto.pim.client.domain;

import java.util.ArrayList;

public class Conexion {
	String destination1;
	String destination2;

	ArrayList<Calle> calles;

	public String getDestination1() {
		return destination1;
	}

	public void setDestination1(String destination1) {
		this.destination1 = destination1;
	}

	public String getDestination2() {
		return destination2;
	}

	public Conexion(String destination1, String destination2, ArrayList<Calle> calles) {
		super();
		this.destination1 = destination1;
		this.destination2 = destination2;
		this.calles = calles;
	}

	public void setDestination2(String destination2) {
		this.destination2 = destination2;
	}

	public ArrayList<Calle> getCalles() {
		return calles;
	}

	public void setCalles(ArrayList<Calle> calles) {
		this.calles = calles;
	}
}
