package com.nissan.app;

import com.nissan.model.Grad;
import com.nissan.model.Undergrad;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grad a=new Grad();
		Undergrad b = new Undergrad();
		boolean p=a.isPassed(85.00);
		boolean l=b.isPassed(70.50);
		if(p)
			System.out.println("Grad passed");
		else
			System.out.println("failed");
		if(l)
			System.out.println("undergrad passed");
		else
			System.out.println("failed");
	}

}
