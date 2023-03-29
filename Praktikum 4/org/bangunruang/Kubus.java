/*
	* File		: Kubus.java
	* Penulis	: Faris Naufal Izzatur Rahman
	* Deskripsi	: Representasi dasar dari objek kubus, turun kelas poligon
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	
	public double hitungLuasAlas(){
		return permukaan.hitungLuas;
	}
}