package com.cl.s6;

public class Tv extends Electric {
	
	private int size;
	
	//생성자
	public Tv() {
		//부모의 생성자 호출, 생략되어 있음
		//매개변수가 없는 기본 생성자 호출
		//부모 생성자가 String 매개변수 가지면 
		//super("");
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	//info 오버라이딩
	public void info() {
		//부모의 info 먼저 찍음
		super.info();
		
		System.out.println("Size : "+this.size);
	}

}
