/*
	* File		: BujurSangkar.java
	* Penulis	: Faris Naufal Izzatur Rahman
	* Deskripsi	: Representasi dasar dari objek bujur sangkar, turun kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas3(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi();
	}
  