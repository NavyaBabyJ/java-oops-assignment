package com.nissan.model;

public class Undergrad extends Student{
	public boolean isPassed(double grade)
	{
		if(grade>=70.0)
		 {
			//System.out.println("Passed");
			return true;
		}
		else {
			//System.out.println("Failed");
			return false;
		}
	}
}

