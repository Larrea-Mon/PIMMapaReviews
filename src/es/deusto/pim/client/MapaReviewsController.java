package es.deusto.pim.client;

import java.util.Map;

public class MapaReviewsController {
	private static MapaReviewsController instance;
	
	public static MapaReviewsController getInstance() {
		if (instance ==  null) {
			instance = new MapaReviewsController();
		}
		return instance;
	}
		
}
