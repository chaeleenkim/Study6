package com.cl.s4;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
	
	//강아지만 하는 행동
	public void guard() {
		System.out.println("집 지키기");
	}

}
