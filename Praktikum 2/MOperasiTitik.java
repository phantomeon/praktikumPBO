/*
	File		: MOperasiTitik.java
	Penulis 	: Faris Naufal Izzatur Rahman - 24060121130055
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas operasi titik.
*/

public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(3,2);
		OperasiTitik o = new OperasiTitik();
		
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
		
		// Refleksi Sumbu X
		o.refleksiX(t);
		
		// Refleksi Sumbu Y
		o.refleksiY(t);
	}
}