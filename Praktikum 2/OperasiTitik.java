/*
	File		: OperasiTitik.java
	Penulis 	: Faris Naufal Izzatur Rahman - 24060121130055
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas titik.
*/

class OperasiTitik{
	private void refleksiSumbuX (Titik t){
		t.ordinat = t.ordinat*(-1);
	}

	private void refleksiSumbuY (Titik t){
		t.absis = t.absis*(-1);
	}
	
	public void refleksiX (Titik t){
		refleksiSumbuX(t);
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
	}
	
	public void refleksiY (Titik t) {
		refleksiSumbuY(t);
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
	}
} 