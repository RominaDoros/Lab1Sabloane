package sabloane;

public class tabel {
	private int nr;
	private String subcap;
	private String cap;
	
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String getSubcap() {
		return subcap;
	}
	public void setSubcap(String subcap) {
		this.subcap = subcap;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	
	public tabel(int nr, String subcap, String cap) {
		this.nr = nr;
		this.subcap = subcap;
		this.cap = cap;
	}
	
	
}
