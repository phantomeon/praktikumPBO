/*
	* File		: MKubus.java
	* Penulis	: Faris Naufal Izzatur Rahman
	* Deskripsi	: Driver class untuk bujur sangkar dan kubus
*/

package org.main;

import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujursangkar = new BujurSangkar(10);
		System.out.println("Luas Bujur Sangkar : " + bujursangkar.hitungLuas3());
		
		Kubus kubus = new Kubus(bujursangkar);
		System.out.println("Volume Kubus : " + kubus.hitungVolume());
		System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());
	}
}