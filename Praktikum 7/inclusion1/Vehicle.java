/*
	* File		: Vehicle.java
	* Penulis	: Faris Naufal Izzatur Rahman - 24060121130055
	* Deskripsi	: Super class Vehicle
*/

package com.oracle.training;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
