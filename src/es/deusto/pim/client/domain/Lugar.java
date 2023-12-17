package es.deusto.pim.client.domain;

import java.util.ArrayList;

public class Lugar {
	String name;
	ArrayList<Review> reviews;
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
	@Override
	public String toString() {
		return "Point [name=" + name + ", reviews=" + reviews + "]";
	}
	public Lugar(String name) {
		super();
		this.name = name;
	}
	
}
