/*
	* File		: Poligon.java
	* Penulis	: Faris Naufal Izzatur Rahman
	* Deskripsi	: Representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public void setJumlahSisi(int sisi){
			jumlahSisi = sisi;
	}
	
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}