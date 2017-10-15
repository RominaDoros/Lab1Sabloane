package sabloane;

import java.util.ArrayList;

public class capitol {
	private String nume;
	private ArrayList<subcapitol> subcapitole= new ArrayList<subcapitol>();
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public ArrayList<subcapitol> getSubcapitole() {
		return subcapitole;
	}
	public void setSubcapitole(ArrayList<subcapitol> subcapitole) {
		this.subcapitole = subcapitole;
	}
	
	public capitol(String nume, ArrayList<subcapitol> subcapitole) {
		this.nume = nume;
		this.subcapitole = subcapitole;
	}

}
