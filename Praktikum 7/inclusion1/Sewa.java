/*
	* File		: Sewa.java
	* Penulis	: Faris Naufal Izzatur Rahman - 24060121130055
	* Deskripsi	: Main class dari super class Vehicle dan sub class Bus dan Car
*/

package com.oracle.training;

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}
