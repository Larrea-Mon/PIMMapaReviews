package es.deusto.pim.client.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class Calle {
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
		return name;
	}
	public Calle(String name) {
		super();
		this.name = name;
		this.reviews = new ArrayList<>();
		
	}
	public float getAverageReviewScore() {
		int result = 0;
		for (int i = 0; i < reviews.size(); i++) {
			result = result + reviews.get(i).getScore();
		}
		result = result/reviews.size();
		return result;
	}
}
