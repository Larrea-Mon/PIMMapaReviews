package es.deusto.pim.client;

import java.util.ArrayList;

import es.deusto.pim.client.domain.*;
public class MapRevMain {
	
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		MapRevService.getInstance().run();
		
	}
}