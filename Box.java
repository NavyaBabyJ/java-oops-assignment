package com.nissan.model;

public class Box {
	public double height;
	public double width;
	public double depth;
	public double vol;
	public Box(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public double volume()
	{
		vol=width*height*depth;
		System.out.println("Volume: "+this.vol);
		return vol;
	}
}
