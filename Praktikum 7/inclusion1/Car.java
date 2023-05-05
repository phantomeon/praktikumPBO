/*
	* File		: Car.java
	* Penulis	: Faris Naufal Izzatur Rahman - 24060121130055
	* Deskripsi	: Sub class Car dari super class Vehicle
*/

package com.oracle.training;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

