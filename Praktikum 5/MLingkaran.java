/**
 * MLingkaran.java 05/05/23
 * Penulis : Faris Naufal Izzatur Rahman
 * Deskripsi : implementasi cara menghitung luas lingkaran        
 * 
 */ 
 import java.util.Scanner;
 
 public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Lingkaran l1 = new Lingkaran(10.2);
		System.out.println("Luas lingkaran 1 dengan"+ 
			"jejari 10.2 satuan adalah "+l1.hitungLuas());
			
		System.out.print("Masukkan jari jari lingkaran 2 : ");
		double jejari1 = scan.nextDouble();
		Lingkaran l2 = new Lingkaran(jejari1);
		System.out.println("Luas lingkaran 2 dengan jejari "
			+jejari1+" satuan adalah "+l2.hitungLuas());
		
		Lingkaran l3 = new Lingkaran();
		System.out.print("Masukkan jari jari lingkaran 3 : ");
		double jejari2 = scan.nextDouble();
		l3.setJejari(jejari2);
		System.out.println("Luas lingkaran 3 dengan jejari "
			+jejari2+" satuan adalah "+l3.hitungLuas());			

	}
 }
  