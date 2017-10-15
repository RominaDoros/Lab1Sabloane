package sabloane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.security.sasl.AuthorizeCallback;

public class carte {
	private String titlu;
	private ArrayList<cuprins> cuprins= new ArrayList<cuprins>();
	private ArrayList<autor> autori= new ArrayList<autor>();
	private ArrayList<capitol> capitole= new ArrayList<capitol>();
	
	public carte(String titlu, ArrayList<sabloane.cuprins> cuprins, ArrayList<autor> autori,
			ArrayList<capitol> capitole) {
		
		this.titlu = titlu;
		this.cuprins = cuprins;
		this.autori = autori;
		this.capitole = capitole;
	}


	public String getTitlu() {
		return titlu;
	}


	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}


	public ArrayList<cuprins> getCuprins() {
		return cuprins;
	}


	public void setCuprins(ArrayList<cuprins> cuprins) {
		this.cuprins = cuprins;
	}


	public ArrayList<autor> getAutori() {
		return autori;
	}


	public void setAutori(ArrayList<autor> autori) {
		this.autori = autori;
	}


	public ArrayList<capitol> getCapitole() {
		return capitole;
	}


	public void setCapitole(ArrayList<capitol> capitole) {
		this.capitole = capitole;
	}

	
	public static void main(String[] args) {

		
	}



}
