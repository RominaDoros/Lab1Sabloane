package sabloane;

import java.util.ArrayList;

public class subcapitol {
	private String subcapit;
	private ArrayList<tabel> tabele= new ArrayList<tabel>();
	private ArrayList<paragraf>paragrafe= new ArrayList<paragraf>();
	private ArrayList<imagine> imagini= new ArrayList<imagine>();
	
	public subcapitol(String subcapit, ArrayList<tabel> tabele, ArrayList<paragraf> paragrafe,
			ArrayList<imagine> imagini) {
		this.subcapit = subcapit;
		this.tabele = tabele;
		this.paragrafe = paragrafe;
		this.imagini = imagini;
	}
	
	public String getSubcapit() {
		return subcapit;
	}
	public void setSubcapit(String subcapit) {
		this.subcapit = subcapit;
	}
	public ArrayList<tabel> getTabele() {
		return tabele;
	}
	public void setTabele(ArrayList<tabel> tabele) {
		this.tabele = tabele;
	}
	public ArrayList<paragraf> getParagrafe() {
		return paragrafe;
	}
	public void setParagrafe(ArrayList<paragraf> paragrafe) {
		this.paragrafe = paragrafe;
	}
	public ArrayList<imagine> getImagini() {
		return imagini;
	}
	public void setImagini(ArrayList<imagine> imagini) {
		this.imagini = imagini;
	}

}
