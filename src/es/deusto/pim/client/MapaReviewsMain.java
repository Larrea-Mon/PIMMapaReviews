package es.deusto.pim.client;

public class MapaReviewsMain {
	
	ArrayListy<Lugar> lugares;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		MapaReviewsService.getInstance().run();
		
	}
	
	public static void populateDB() {
		// TODO Auto-generated method stub
		
	}	
}
