package com.nissan.model;

public class Grad extends Student{

		public boolean isPassed(double grade)
		{
			if(grade>=80.0) {
				//System.out.println("Passed");
				return true;
			}
			else {
				//System.out.println("Filed");
				return false;
			}
		}
}
