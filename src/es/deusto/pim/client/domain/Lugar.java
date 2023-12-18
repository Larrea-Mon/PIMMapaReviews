package es.deusto.pim.client.domain;

import java.util.ArrayList;

public class Lugar {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Lugar [name=" + name +"]";
	}
	public Lugar(String name) {
		super();
		this.name = name;
	}
	
}
