package com.brkbthn;

public class Adres {
	private String sehir, semt, mahalle;

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getSemt() {
		return semt;
	}

	public void setSemt(String semt) {
		this.semt = semt;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getSehir()+" "+getMahalle()+" "+getSemt();
	}
	

}
