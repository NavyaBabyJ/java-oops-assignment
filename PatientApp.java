package com.nissan.app;

import com.nissan.beam.Money;
import com.nissan.beam.Patient;

public class PatientApp {

	public static void main(String[] args) {
		Patient m = new Patient("Ali", 14562, 101, 2017, 500, "Hospital", "addressss");
		
		System.out.println(m);
		
		Money obj = new Money();
		
		m.generateFees(obj);
		
	}
	

}