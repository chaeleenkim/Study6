package com.cl.s6;

public class Electric {
	
	private String brand;
	private String color;
	private int price;
	private int point;
	
	//기본생성자
	public Electric(){}
	
	//매개변수가 있는 생성자
//	public Electric(String brand) {
//		this.brand = brand;
//	}
	
	public void info() {
		System.out.println("-------------------------");
		System.out.println("Brand : " +this.brand);
		System.out.println("Color : " + this.color);
		System.out.println("Price : " +this.price);
		System.out.println("Point : " +this.point);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	

}
