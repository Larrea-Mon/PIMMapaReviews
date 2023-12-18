package es.deusto.pim.client.domain;

import java.util.ArrayList;

public class Calle {
	String name;
	ArrayList<Review> reviews;
	ArrayList<Lugar> connections;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Review> getReviews() {
		return reviews;
	}
	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}
	public ArrayList<Lugar> getConnections() {
		return connections;
	}
	public void setConnections(ArrayList<Lugar> connections) {
		this.connections = connections;
	}
	@Override
	public String toString() {
		return "Street [name=" + name + ", reviews=" + reviews + ", connections=" + connections + "]";
	}
	public Calle(String name) {
		super();
		this.name = name;
	}
}