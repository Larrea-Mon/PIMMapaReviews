package es.deusto.pim.client.domain;

public class Review {
	int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Review(int score) {
		super();
		this.score = score;
	}	
}
