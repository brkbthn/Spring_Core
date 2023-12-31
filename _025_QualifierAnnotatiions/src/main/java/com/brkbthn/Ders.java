package com.brkbthn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ders {
	
	@Autowired
	@Qualifier("ogrenci3")
	private Ogrenci ogrenci;
	
	
	
	private int puan;
	private String ders;
	public Ogrenci getOgrenci() {
		return ogrenci;
	}
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}
	@Override
	public String toString() {
		return "Ders [ogrenci=" + ogrenci + ", puan=" + puan + ", ders=" + ders + "]";
	}
	
	

}
