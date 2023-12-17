package es.deusto.pim.client.domain;

import java.util.ArrayList;

public class Street {
	String name;
	ArrayList<Review> reviews;
	ArrayList<Point> connections;
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
	public ArrayList<Point> getConnections() {
		return connections;
	}
	public void setConnections(ArrayList<Point> connections) {
		this.connections = connections;
	}
	@Override
	public String toString() {
		return "Street [name=" + name + ", reviews=" + reviews + ", connections=" + connections + "]";
	}
	public Street(String name) {
		super();
		this.name = name;
	}
}
