/**
 * Lingkaran.java 05/05/23
 * Penulis : Faris Naufal Izzatur Rahman - 24060121130055
 * Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran            
 * 
 */ 
 //mengambil konstanta yang ada di kelas java.lang.Math
 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(){}
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public void setJejari(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
 }
 
 