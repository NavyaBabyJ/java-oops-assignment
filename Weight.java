package com.nissan.model;

public class Weight extends Box{
	public double weight;

	public Weight(double height, double width, double depth,double weight) {
		super(height, width, depth);
		this.weight=weight;
		
	}
	public void weight()
	{
		System.out.println("Weight: "+this.weight);
		double v= super.volume();
		System.out.println(v);
	}

}
