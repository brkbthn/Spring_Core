package com.brkbthn;
import java.util.*;

public class Ogrenci {
	
	private String adi, soyadi, bolumu;
	private String yasi;
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getBolumu() {
		return bolumu;
	}
	public void setBolumu(String bolumu) {
		this.bolumu = bolumu;
	}
	public String getYasi() {
		return yasi;
	}
	public void setYasi(String yasi) {
		this.yasi = yasi;
	}
	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", bolumu=" + bolumu + ", yasi=" + yasi + "]";
	}
	
}
