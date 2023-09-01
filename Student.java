package com.nissan.model;

public class Student {
	public String name;
	public int id;
	public String address;
	public int age;
	public double grade;
	
	public boolean isPassed(double grade)
	{
		if(grade>=70.0)
		return true;
		else
			return false;
		
	}

}
