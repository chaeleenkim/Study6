package com.cl.s1;
//추상 클래스
public abstract class Product {
	
	//공통적인 요소 추출
	//setter,getter 만듦
	private String brand;
	private String cpu;
	private int ram;
	private int price;
	
	//추상 메서드
	public abstract void info();
	
	//일반 메서드
	public void info2() {
		
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
