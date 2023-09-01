package com.nissan.beam;

import java.time.Year;

public class Patient extends Person{
	
	public int patientNo, yearOfJoining;
	public double fees;
	public String hospital,address;
	
	public Patient(String name, long phNo, int patientNo, int yearOfJoining, double fees, String hospital,
			String address) {
		super();
		this.patientNo = patientNo;
		this.yearOfJoining = yearOfJoining;
		this.fees = fees;
		this.hospital = hospital;
		this.address = address;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void generateFees(Money obj) {
		
		
		int year = Year.now().getValue();
		int diff  = year - this.yearOfJoining;
		double totalFee = diff * obj.basicFee+this.fees;

		
		System.out.println("Total fees: " + totalFee);
		
	}

	@Override
	public String toString() {
		return "Patient [patientNo=" + patientNo + ", yearOfJoining=" + yearOfJoining + ", fees=" + fees + ", hospital="
				+ hospital + ", address=" + address + "]";
	}
		

}