/*
	File 		: Titik.java
	Penulis		: Faris Naufal Izzatur Rahman - 24060121130055
	Deskripsi	: Kelas yang berisi program untuk membuat data koordinat titik dan menampilkannya ke layar.
*/

public class Titik{
	double absis;				//absis
	double ordinat;				//ordinat
	static int counterTitik;	//penghitung objek titik yang telah dibuat
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}

	public Titik(double a, double b){
		counterTitik++;
		absis = a;
		ordinat = b;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat (){
		return ordinat;
	}
	
	int getCounterTitik (){
		return counterTitik;
	}
}